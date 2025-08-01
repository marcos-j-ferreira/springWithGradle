package com.marcos.springwithgradle.dto.response;

import java.util.ArrayList;
import java.time.LocalTime;

public record Status (LocalTime time, int requisicao){}