PGDMP  %                    }            demo    14.13 (Homebrew)    16.0 	               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    45423    demo    DATABASE     f   CREATE DATABASE demo WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'C';
    DROP DATABASE demo;
                hanshulchandel    false                        2615    2200    public    SCHEMA     2   -- *not* creating schema, since initdb creates it
 2   -- *not* dropping schema, since initdb creates it
                hanshulchandel    false                       0    0    SCHEMA public    ACL     Q   REVOKE USAGE ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO PUBLIC;
                   hanshulchandel    false    4            �            1259    45424    student    TABLE     ]   CREATE TABLE public.student (
    sid integer NOT NULL,
    sname text,
    marks integer
);
    DROP TABLE public.student;
       public         heap    hanshulchandel    false    4                      0    45424    student 
   TABLE DATA           4   COPY public.student (sid, sname, marks) FROM stdin;
    public          hanshulchandel    false    209   �       |           2606    45430    student student_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_pkey PRIMARY KEY (sid);
 >   ALTER TABLE ONLY public.student DROP CONSTRAINT student_pkey;
       public            hanshulchandel    false    209                  x�3��H�+�(��45������ .�.     