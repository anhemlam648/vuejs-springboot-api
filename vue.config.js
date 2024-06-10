const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    port: 3030,
   // proxy: 'http://localhost:8080',
  }
})