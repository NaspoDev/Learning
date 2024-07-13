# FROM a base image. 
# We will build our image on top of this base image.
# This base image is node, which is based on linux. It's an official image, find official images on the docker hub.

# The node image has different version built on different linux distrobutions.
# The :alpine is a tag, which is specifies which Linux distrobution we want to use.
FROM node:alpine

# COPY <source> <destination>
# In this case, copy all project files (specified with the "."), to the /app directory in the container.
# The /app directory is created if it doesn't exist.
# /app can be any name, but it's a convention to use /app.
COPY . /app

# WORKDIR <path>
# Sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow it in the Dockerfile.
WORKDIR /app

# CMD ["executable", "param1", "param2"]
# The command to run when the container starts. In this case, run node with the index.js file (node index.js).
CMD ["node", "app.js"]