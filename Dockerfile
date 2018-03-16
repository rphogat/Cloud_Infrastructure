FROM ubuntu:latest

WORKDIR /home

# Install required libraries, download benchmark suite and untar files
RUN apt-get update && apt-get install -y\
  wget\
  gcc \
  make\
&& wget http://iozone.org/src/current/iozone3_365.tar \
&& tar -xf iozone3_365.tar \
&& rm iozone3_365.tar \
&& apt-get clean \
&& rm -rf /var/lib/apt/lists/*

RUN cd iozone*/src/current && make linux && ./iozone -Rab output.wks