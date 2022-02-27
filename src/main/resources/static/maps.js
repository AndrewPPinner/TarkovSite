const app = Vue.createApp({
    data() {
        return{
        woodsShow: null,
        customShow: null,
        reserveShow: null,
        lighthouseShow: null,
        interchangeShow: null,
        shorelineShow: null
        }
    },
    methods: {
        woodsShowFun() {
            this.woodsShow = true;
            this.customShow = false;
            this.reserveShow = false;
            this.lighthouseShow = false;
            this.interchangeShow = false;
            this.shorelineShow = false;
        },
        customShowFun() {
            this.customShow = true;
            this.reserveShow = false;
            this.lighthouseShow = false;
            this.interchangeShow = false;
            this.shorelineShow = false;
            this.woodsShow = false;

        },
        reserveShowFun() {
            this.reserveShow = true;
            this.customShow = false;
            this.lighthouseShow = false;
            this.interchangeShow = false;
            this.shorelineShow = false;
            this.woodsShow = false;
        },
        lighthouseShowFun() {
            this.reserveShow = false;
            this.customShow = false;
            this.lighthouseShow = true;
            this.interchangeShow = false;
            this.shorelineShow = false;
            this.woodsShow = false;
        },
        interchangeShowFun() {
            this.reserveShow = false;
            this.customShow = false;
            this.lighthouseShow = false;
            this.interchangeShow = true;
            this.shorelineShow = false;
            this.woodsShow = false;
        },
        shorelineShowFun() {
            this.reserveShow = false;
            this.customShow = false;
            this.lighthouseShow = false;
            this.interchangeShow = false;
            this.shorelineShow = true;
            this.woodsShow = false;
        }


    }

})

app.mount("#app")