INSERT INTO public.lesson (
lessonid, description, place, userid) VALUES (
'1'::integer, 'Clase número 1'::character varying(255), 'Maria Luisa'::character varying(255), '1'::integer)
 returning lessonid;

 INSERT INTO public.lesson (
lessonid, description, place, userid) VALUES (
'2'::integer, 'Clase número 1'::character varying(255), 'Maria Luisa'::character varying(255), '2'::integer)
 returning lessonid;

 INSERT INTO public.lesson (
lessonid, description, place, userid) VALUES (
'3'::integer, 'Clase número 2'::character varying(255), 'Maria Luisa'::character varying(255), '1'::integer)
 returning lessonid;

 INSERT INTO public.lesson (
lessonid, description, place, userid) VALUES (
'4'::integer, 'Clase número 3'::character varying(255), 'Maria Luisa'::character varying(255), '1'::integer)
 returning lessonid;

COMMIT;
