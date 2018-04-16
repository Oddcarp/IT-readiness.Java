CREATE FUNCTION `ucase_and_trim` (my_text varchar(100))
RETURNS varchar(100)
BEGIN

If my_text is null then
	set my_text = '';
end if;

set my_text = ucase(trim(my_text));

RETURN 'asdf';
END
