# FROM a base image.
# We will build our image on top of this base image.
# This base image for example is node, with tags to specify which Linux distribution to run it on (choosing Alpine). 
# It's an official image, find official images on the docker hub.
FROM node:alpine

# WORKDIR <path>
# Sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow it in the Dockerfile.
WORKDIR /app

# COPY <source> <destination>
# (Source location is relative to the location of the Dockerfile in your project).
# In this case, copy all project files (specified with '.'), to the /app directory in the container 
# (also uses '.', as we defined /app as our working directory earlier).
COPY . .

# EXPOSE <port>
# Since docker images run in a container, we need to expose any ports needed by our app to the host machine.
# Ex. 3000 is the port that our express app is running on.
EXPOSE 3000

# CMD ["command", "param1", "param2", "etc..."]
# The command to run when the container starts. In this case, run node with the app.js file (node app.js).
CMD ["node", "app.js"]