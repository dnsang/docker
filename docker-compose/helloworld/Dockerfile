#Build an image starting with the Python 3.4 image.
FROM python:3.4-alpine
#add current folder to /code folder in the image
ADD . /code
#set working directory to /code
WORKDIR /code
RUN pip install -r requirements.txt
CMD ["python", "app.py"]
