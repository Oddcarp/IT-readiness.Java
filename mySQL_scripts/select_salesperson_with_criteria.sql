CREATE DEFINER=`root`@`localhost` PROCEDURE `salesperson_select_with_criteria`(region_code_param int, is_smoker_param bit, out is_finished bit)
BEGIN
	declare max_region_code int;
    declare i int default 1;
    
    
    
	select max(region_code_id) into max_region_code from java_class.region_code;
    
    while i <= max_region_code do
		
        set i = i + 1;
        
	end while;
    
    case
		when region_code_param >= 1 and region_code_param <= max_region_code then    
			select * from java_class.salesperson_employee, i where region_code_id = region_code_param or is_smoker = is_smoker_param;
		when region_code_param < 1 then
			select 'Don\'t be silly you can\'t have a negative region code!!';
		else
			select 'Region code not recognized';
	end case;
    
	
/*    if region_code_param >= 1 and region_code_param <= max_region_code then    
		select * from java_class.salesperson_employee where region_code_id = region_code_param or is_smoker = is_smoker_param;
    elseif region_code_param < 1 then
		select 'Don\'t be silly you can\'t have a negative region code!!';
    else
		select 'Region code not recognized';
	end if;
 */       
        
    set is_finished = 1;
END