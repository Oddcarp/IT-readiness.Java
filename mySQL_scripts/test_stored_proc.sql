-- try to run stored proc

call salesperson_select_with_criteria(4,1,@my_result);
select @my_result;