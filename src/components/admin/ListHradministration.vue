<template>
    <div class="home-admin">
        <HeaderAdmin />
        <div class="list-hradmin">
         <router-link to="/addHradministration" class="sidebar-link"   style="display: inline-block; padding: 10px 20px; background-color: #004080; color: #fff; text-align: center; text-decoration: none; border-radius: 4px; width: 100px;">Thêm Bài Viết</router-link>
            <h1 style="text-align:center;">{{ title }}</h1>
            <p style="text-align:center;">{{ content }}</p>
            <ul>
                <table class="hradmin-table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Title</th>
                            <th>Description</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="hradmin in hrAdministrations" :key="hradmin.id">
                            <td>{{ hradmin.id }}</td>
                            <td>{{ hradmin.title }}</td>
                            <td>{{ hradmin.description }}</td>
                            <td>
                                <button @click="editHradmin(hradmin.id)">Cập Nhật</button>
                                <span class="button-separator">|</span>
                                <button @click="deleteHradmin(hradmin.id)">Xóa</button>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </ul>
        </div>
        <FooterAdmin />
    </div>
</template>

<script>
import HeaderAdmin from '../partials/HeaderAdmin';
import FooterAdmin from '../partials/FooterAdmin';
import axios from 'axios';

export default {
    name: "ListHradministration",
    components: {
        HeaderAdmin,
        FooterAdmin
    },
    data() {
        return {
            title: "Trang quản lý bài viết về hành chính nhân sự",
            content: "Trang update bài viết",
            hrAdministrations: []
        };
    },
    mounted() {
      this.fetchHrAdministrations();
    },
    methods: {
        fetchHrAdministrations() {
            axios.get('http://localhost:8080/hradministrations/list')
                .then(response => {
                    this.hrAdministrations = response.data;
                })
                .catch(error => {
                    console.error("List Hradministration error!", error);
                });
        },
        editHradmin(id) {
            axios.get(`http://localhost:8080/hradministrations/hradministration/${id}`)
                .then(response => {
                   const editedHradmin = response.data;
                   console.log("Đang chỉnh sửa mục với ID:", editedHradmin.id);
                })
                .catch(error => {
                    console.error("Error preview hradministration details for edit", error);
                });
        },
        deleteHradmin(id) {
            axios.delete(`http://localhost:8080/hradministrations/delete/${id}`)
                .then(response => {
                    if (response.data) {
                        console.log("Đã xóa hradmin với ID:", id);
                        this.hrAdministrations = this.hrAdministrations.filter(hradmin => hradmin.id !== id);
                    } else {
                        console.error("Delete failed.");
                    }
                })
                .catch(error => {
                    console.error("Error delete hradministration", error);
                });
        }
    }
};
</script>

<style>
.home-admin {
  display: flex;
  flex-direction: column;
  height: 100%;
  background-color: #f1f1f1; 
  font-family: Arial, sans-serif;
}

.header-admin {
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 1000;
  background-color: #004080; 
  color: #fff;
  text-align: center;
  padding: 15px 0;
  font-size: 18px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); 
}

.list-hradmin {
  flex: 1;
  padding: 100px 20px 20px; 
  margin: 20px auto;
  background-color: #ffffff; 
  border: 1px solid #dee2e6; 
  border-radius: 8px; 
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  width: 95%; 
  max-width: 100%; 
  overflow: hidden;
  margin-top: -50px;
}

.list-hradmin h1 {
  color: #004080;
  margin-bottom: 10px;
  font-size: 24px;
  font-weight: bold;
}

.list-hradmin p {
  color: #333;
  font-size: 16px;
  line-height: 1.6; 
}

.footer-admin {
  position: fixed;
  bottom: 0;
  width: 100%;
  z-index: 1000;
  background-color: #004080;
  color: #fff;
  text-align: center;
  padding: 10px 0;
  font-size: 14px;
  box-shadow: 0 -2px 4px rgba(0, 0, 0, 0.1); 
}

.image {
  display: block;
  margin: 20px auto;
}

.hradmin-table {
  width: 50%;
  border-collapse: collapse;
  margin-top: 20px;
  margin-left: 320px;
}

.hradmin-table th,
.hradmin-table td {
  border: 1px solid #ddd;
  padding: 8px;
  text-align: center;
}

.hradmin-table th {
  background-color: #004080;
  color: white;
}

.hradmin-table tr:nth-child(even) {
  background-color: #f2f2f2;
}

.hradmin-table tr:hover {
  background-color: #ddd;
}

.button-separator {
  margin: 0 5px; 
  font-weight: bold;
  color: #004080;
}
</style>
