
from flask import Blueprint, render_template

# Handles routes for our website.
# Pages, navigation.

views = Blueprint('views', __name__)

# home page
@views.route('/')
def home():
    return render_template("home.html")