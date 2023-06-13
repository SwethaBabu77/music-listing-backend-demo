package com.ust.admin_service.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicDto {

    @NotNull
    private String musicName;
    @NotNull
    private String artistName;
    @NotNull
    private String musicGenre;
    @NotNull
    private String songReleaseDate;
    @NotNull
    private String songLanguage;
    @NotNull
    private String duration;
    @NotNull
    private String country;
    @Size(min=1,max=10,message="Overall rating must be between 1 and 10")
    private double overallRate;
    }


