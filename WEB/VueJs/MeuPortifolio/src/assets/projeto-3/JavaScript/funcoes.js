window.onload = function() {
    var map;
    function iniciar(){
        mapProp = {
            center: new google.maps.LatLng(-18.512025601089174, -54.74592716226344),
            scrollwheel:false,
            zoom:15,mapTypeId:google.maps.MapTypeId.ROADMAP
        }
        map = new google.maps.Map(document.getElementById("mapa-id"),mapProp);
    }

    function addMarker(lat,long,icon,content) {
        var latLng = {'lat':lat,'lng':long};
        var marker = new google.maps.Marker({position:latLng,map:map,icon:icon});
        
        var infoWindow = new google.maps.InfoWindow({content:content,maxWidth:200,pixelOffset: new google.maps.Size(0,20)});

        google.maps.event.addListener(marker,'click',function(){infoWindow.open(map,marker);});
        
    }

    iniciar();
    addMarker(-18.511801779672872, -54.74584133158267,'','meu endereco personalizado');
}