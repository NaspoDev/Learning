from flask import Blueprint, render_template, request, flash

# Handles user authentication (and auth page)

auth = Blueprint('auth', __name__)

# by default routes can only accept get requests, but we can specify other types of requets that we want to accept
@auth.route('/login', methods=['GET', 'POST']) 
def login():
    return render_template("login.html")

@auth.route('/logout')
def logout():
    return "<p>Logout</p>"

@auth.route('/sign-up', methods=['GET', 'POST'])
def sign_up():
    if request.method == 'POST':
        print(request.form) # prints the from data to console for demo purposes

        # parsing the information from the request data
        email = request.form.get('email')
        first_name = request.form.get('first-name')
        password1 = request.form.get('password1')
        password2 = request.form.get('password2')

        if len(email) < 4:
            flash('Email must be longer than 4 characters.', category='error')
        elif len(first_name) < 2:
            flash('First name must be greater than 1 character', category='error')
        elif password1 != password2:
            flash('Passwords don\'t match!', category='error')
        elif len(password1) < 7:
            flash('Password must be at least 7 characters', category='error')
        else:
            # add user to database
            flash('Account craeted!', category='success')


    return render_template("sign_up.html")