const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot81430/",
            name: "springboot81430",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot81430/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智慧医疗系统"
        } 
    }
}
export default base
