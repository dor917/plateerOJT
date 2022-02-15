// Call the dataTables jQuery plugin
$(document).ready(function() {
  $('#dataTable').DataTable().destroy();

  $('#dataTable').DataTable( {
        "ajax": {url:"/admin/getUserData", dataSrc:""},
        "columns": [
            { "data": "id" },
        	{ "data": "name" },
            { "data": "email" },
            { "data": "phone" },
            { "data": "address" },
            { "data": "city" },
            { "data": "room_type" },
            { "data": "check_in_date" },
            { "data": "reserve_check"}
        ], 'columnDefs': [
         {
            'targets': 8,
            'render': function ( data, row ) {
                     console.log(data);

	                    if ( data === 1 ) {
	                        return `<label class="switch" style="margin-top: 5px;"><input type="checkbox" class="checkbox" checked><span class="slider round"></span></label>`;
	                    } else {
	                    	return `<label class="switch" style="margin-top: 5px;"><input type="checkbox" class="checkbox" ><span class="slider round"></span></label>`;
	                    }

                  	}
         }
      ],
      "fnDrawCallback": function() {
                $(".checkbox").click(function (e) {
                	let checkbox = e.target;

                	let address = e.target.parentNode.parentNode.previousSibling.previousSibling.previousSibling.previousSibling;
                	let name = address.previousSibling.previousSibling.previousSibling;
                	let id = name.previousSibling.innerText;

                	reserveCheck = checkbox.checked? 1: 0;
                	console.log(checkbox.checked);
                    	$.ajax({
							url: '/admin/reserveCheck',
							dataType: 'application/json',
							contentType: 'application/json',
							type: 'post',
							data: JSON.stringify ({
								"id": parseInt(id),
								"reserveCheck": reserveCheck
							}),
							success: function() {
							      console.log('Success');
							}
						})

                });
            }

    } );
});