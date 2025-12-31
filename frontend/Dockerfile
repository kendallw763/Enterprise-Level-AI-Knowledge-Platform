# Node 20 Alpine
FROM node:20-alpine

WORKDIR /AIKP-frontend

# Copy package files and install dependencies
COPY package*.json ./
RUN npm install

# Copy all frontend files
COPY . .

# Expose container port 8080
EXPOSE 8080

# Run Node server
CMD ["node", "aikp.js"]
