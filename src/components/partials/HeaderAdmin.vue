<template>
  <div>
    <header class="header-admin">
      <button class="menu-toggle" @click="toggleSidebar">☰ Menu</button>
      <h1 style="margin-right: 50px; font-size: 30px; color: #FFFFFF; text-align: center;">Admin Dashboard</h1>
    </header>
    <nav :class="['sidebar', { 'sidebar-open': isSidebarOpen }]">
      <h1 style="margin-top: -40px; color: #FFFFFF;">Quản lý Menu</h1>
      <hr style="background-color: #FFFFFF;">
      <router-link to="/admin" class="sidebar-link" style="color: #33FFFF;">🏠 Trang Chủ</router-link>
      <router-link to="/adminlisthr" class="sidebar-link" style="color: #FFFF00;">📂 ListHrAdmin</router-link>
      <router-link to="/admin" class="sidebar-link" style="color: #FFFF00;">📂 ListCategory</router-link>
      <router-link to="/adminlistarchiteture" class="sidebar-link" style="color: #FFFF00;">📂 ListAchiterture</router-link>
      <router-link to="/adminlistapply" class="sidebar-link" style="color: #FFFF00;">📂 ListApply</router-link>
      <router-link to="/admin" class="sidebar-link" style="color: #FFFF00;">👩‍💼 ListUser</router-link>
    </nav>
    <div :class="['overlay', { 'overlay-show': isSidebarOpen }]" @click="toggleSidebar"></div>
  </div>
</template>

<script>
export default {
  name: 'HeaderAdmin',
  data() {
    return {
      isSidebarOpen: false,
    };
  },
  methods: {
    toggleSidebar() {
      this.isSidebarOpen = !this.isSidebarOpen;
    },
  },
};
</script>

<style>
.header-admin {
  background-color: #004080; 
  color: #fff;
  text-align: center;
  padding: 10px 20px;
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 1000;
  display: flex;
  justify-content: space-between;
  align-items: center;
  overflow: hidden;
}

.header-admin h1 {
  margin: 0;
}

.menu-toggle {
  background: none;
  border: none;
  color: #fff;
  font-size: 24px;
  cursor: pointer;
}

.sidebar {
  position: fixed;
  top: 0;
  left: -300px; 
  width: 250px;
  height: 100%;
  background-color: #004080; 
  color: #333; 
  padding-top: 60px; 
  transition: left 0.3s ease;
  z-index: 1001;
  display: flex;
  flex-direction: column;
  padding-left: 20px;
}

.sidebar-open {
  left: 0; 
}

.sidebar-link {
  background-color: #8B8989; 
  display: block;
  padding: 15px 20px;
  text-decoration: none;
  border-radius: 5px;
  margin-bottom: 50px; 
}

.sidebar-link:last-child {
 margin-bottom: 260px;
}

.sidebar-link:hover {
  background-color: #0099cc; 
}

.overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5); 
  opacity: 0;
  visibility: hidden;
  transition: opacity 0.3s ease, visibility 0.3s ease;
}

.overlay-show {
  opacity: 1;
  visibility: visible;
}
</style>
