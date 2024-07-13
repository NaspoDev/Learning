from flask import Flask
from flask_sqlalchemy import SQLAlchemy

# Create our database
db = SQLAlchemy()
DB_NAME = "database.db"

# The source of our app.
def create_app():
    app = Flask(__name__)
    # secret key is normally very important, and should be kept hidden. But it doesnt really matter for this tutorial project (not a real production project)
    app.config['SECRET_KEY'] = 'hweoighdjsljesofdjsjp9043jnjgd9'
    app.config['SQLALCHEMY_DATABASE_URI'] = f'sqlite:///{DB_NAME}'
    db.init_app(app)

    from .views import views
    from .auth import auth

    # Registering blueprints
    # url prefix is the prefix of how every route in the specified blueprint should be accesses.
    # Ex: for auth, url_prefix='/auth' means every route setup in auth blueprint trails /auth. 
    # Ex pt 2: @auth.route('/home'), to access via the web, /auth/home 
    app.register_blueprint(views, url_prefix='/')
    app.register_blueprint(auth, url_prefix='/')

    return app