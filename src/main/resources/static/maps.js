const app = Vue.createApp({
    data() {
        return{
        woodsShow: null,
        customShow: null,
        reserveShow: null
        }
    },
    methods: {
        woodsShowFun() {
            this.woodsShow = true;
            this.customShow = false;
            this.reserveShow = false;
        },
        customShowFun() {
            this.woodsShow = false;
            this.customShow = true;
            this.reserveShow = false;
        },
        reserveShowFun() {
            this.woodsShow = false;
            this.customShow = false;
            this.reserveShow = true;
        }


    }

})

app.mount("#app")