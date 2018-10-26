var FrontEndModule =(function(){
    var errorMessage = function(){
                    alert("There is a problem with our servers. We apologize for the inconvince, please try again later");
                };

    return{


        showCityInfo: function(cityInfo){

                        for(key in cityInfo){
                            $("#Info").append("<p>Atribute:</p><p id='tag"+key+"'>"+key+ "</p><p>Values:</p><p id='tag"+cityInfo[key]+"'>"+cityInfo[key]+ "</p> ");
                            /*for(map in cityInfo[key]){

                                $("#tag"+cityInfo[key]).append("<tbody> <tr> <td>"+[map]+"</td> <td>"+"</td> </tr> </tbody>");
                            }*/
                        }


                    }

                }
})();