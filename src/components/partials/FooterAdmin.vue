<template>
  <footer class="footer-admin">
    <p style="color:#FFFFFF;">{{ title }}</p>
  </footer>
</template>

<script>
export default {
  name: 'FooterAdmin',
  data() {
    return {
      title: "Company © 2024 Your Company. All rights reserved.",
    }
  }
}
</script>

<style>
.footer-admin {
   background-color: #004080;
  color: #fff;
  text-align: center;
  padding: 15px 20px;
  font-size: 14px;
  position: fixed;
  bottom: 0;
  width: 100%;
  box-shadow: 0 -2px 4px rgba(0, 0, 0, 0.1);

}
</style>
