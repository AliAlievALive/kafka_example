package com.halal.model;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime created) {
}
