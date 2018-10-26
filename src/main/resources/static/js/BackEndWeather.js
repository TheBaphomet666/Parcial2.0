var BackEndModule =(function(){
    return{
        getWeather: async function(callback){

                            await Promise.resolve(axios.get('/Weather/'+document.getElementById('City').value))
                                    .then(async function(response){
                                        FrontEndModule.showCityInfo(response.data);
                                    }
                )}
        };


})();