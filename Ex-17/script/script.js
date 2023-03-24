$(document).ready(function(){
    var  para =$("<p></p>").text('Sirius is a national integrator of technology-based business solutions that span the enterprise, including the data center and lines of business. Built on products and services from the world’s top technology companies, Sirius solutions are installed, configured and supported by our dedicated teams of highly certified experts.With the right people and the right partners, Sirius focuses on solutions that will help you manage your operations, optimize your IT, secure it all, and transform your business. We require our teams to be certified in multiple disciplines and products, so they can help you get from the high-level architecture of a solution all the way down to the technical configuration and implementation of point-products.Since its founding in 1980, Sirius has grown to be one of the largest IT solutions integrators in the U.S. Today, Sirius offers integrated, multivendor technology solutions that meet the requirements of the full range of organizations, from small businesses with fewer than 500 employees to large enterprises with thousands of employees and hundreds of locations  ')
    var image=$('<img src="./teamwork-and-collaboration_1200.jpg" alt="" />')
    $(".about_content").append(para,image);
   
    
    var para_one=$("<p></p>").text('Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integerut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sitamet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo utodio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate Sirius is a national integrator of technology-based business solutions that span the enterprise, including the data center and lines of business. Built on products and services from the world’s top technology companies, Sirius solutions are installed, configured and supported by our dedicated teams of highly certified experts.With the right people and the right partners, Sirius focuses on solutions that will help you manage your operations, optimize your IT, secure it all, and transform your business. We require our teams to be certified in multiple disciplines and products, so they can help you get from the high-level architecture of a solution all the way down to the technical configuration and implementation of point-products.Since its founding in 1980, Sirius has grown to be one of the largest IT solutions integrators in the U.S. Today, Sirius offers integrated, multivendor technology solutions that meet the requirements of the full range of organizations, from small businesses with fewer than 500 employees to large enterprises with thousands of employees and hundreds of locations');
     $("#para_one").append(para_one);

     
    var para_two=$("<p></p>").text('Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integerut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sitamet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo utodio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputateSirius is a national integrator of technology-based business solutions that span the enterprise, including the data center and lines of business. Built on products and services from the world’s top technology companies, Sirius solutions are installed, configured and supported by our dedicated teams of highly certified experts.With the right people and the right partners, Sirius focuses on solutions that will help you manage your operations, optimize your IT, secure it all, and transform your business. We require our teams to be certified in multiple disciplines and products, so they can help you get from the high-level architecture of a solution all the way down to the technical configuration and implementation of point-products.Since its founding in 1980, Sirius has grown to be one of the largest IT solutions integrators in the U.S. Today, Sirius offers integrated, multivendor technology solutions that meet the requirements of the full range of organizations, from small businesses with fewer than 500 employees to large enterprises with thousands of employees and hundreds of locations ');
     $("#para_two").append(para_two);

     
    var para_three=$("<p></p>").text('Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integerut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sitamet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo utodio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate Sirius is a national integrator of technology-based business solutions that span the enterprise, including the data center and lines of business. Built on products and services from the world’s top technology companies, Sirius solutions are installed, configured and supported by our dedicated teams of highly certified experts.With the right people and the right partners, Sirius focuses on solutions that will help you manage your operations, optimize your IT, secure it all, and transform your business. We require our teams to be certified in multiple disciplines and products, so they can help you get from the high-level architecture of a solution all the way down to the technical configuration and implementation of point-products.Since its founding in 1980, Sirius has grown to be one of the largest IT solutions integrators in the U.S. Today, Sirius offers integrated, multivendor technology solutions that meet the requirements of the full range of organizations, from small businesses with fewer than 500 employees to large enterprises with thousands of employees and hundreds of locations');
     $("#para_three").append(para_three);

     
    var para_four=$("<p></p>").text('Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integerut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sitamet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo utodio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate Sirius is a national integrator of technology-based business solutions that span the enterprise, including the data center and lines of business. Built on products and services from the world’s top technology companies, Sirius solutions are installed, configured and supported by our dedicated teams of highly certified experts.With the right people and the right partners, Sirius focuses on solutions that will help you manage your operations, optimize your IT, secure it all, and transform your business. We require our teams to be certified in multiple disciplines and products, so they can help you get from the high-level architecture of a solution all the way down to the technical configuration and implementation of point-products.Since its founding in 1980, Sirius has grown to be one of the largest IT solutions integrators in the U.S. Today, Sirius offers integrated, multivendor technology solutions that meet the requirements of the full range of organizations, from small businesses with fewer than 500 employees to large enterprises with thousands of employees and hundreds of locations');
     $("#para_four").append(para_four);

    $table= $('<table class="table">');
    $.getJSON('script/locations.json',function(location)
     {

        location.forEach(element => {
            $row=$('<tr class="row">');
            $column=$(`<td><div ><img src="${element.country}" class="image"/></div></td>"+"<td>${element.state}</td>"+"<td>${element.city}</td>"+"<td>${element.contact}</td>`);
            $row.append($column);
            $table.append($row);
        });
    });
    $(".location_content").append($table);


    $("#about").click(function(){
        $("#about").css("background-color","blue");
        $("#location").css("background-color","black");
        $("#solution").css("background-color","black");
        $(".about_content").css("display","block");
        $(".solution_content").css("display","none");
        $(".location_content").css("display","none");
    });
    $("#solution").click(function(){
        $("#about").css("background-color","black");
        $("#solution").css("background-color","blue");
        $("#location").css("background-color","black");
        $(".about_content").css("display","none");
        $(".solution_content").css("display","block");
        $("#accordion").accordion();

    });
    $("#location").click(function(){
        $("#about").css("background-color","black");
        $("#location").css("background-color","blue");
        $("#solution").css("background-color","black");
        $(".solution_content").css("display","none");
        $(".about_content").css("display","none");
        $(".location_content").css("display","block")

    });


});

 