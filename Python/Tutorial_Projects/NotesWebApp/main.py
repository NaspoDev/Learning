from website import create_app

app = create_app()

if __name__ == '__main__':
    # debug = True will automatically restart the web server whenever we make a change to our python code.
    # you want this False for a production server. But for the initial development phase (and tutorial) we like True
    app.run(debug=True)
    