package org.openapitools.configuration;

import org.openapitools.model.FormDataFDescending;
import org.openapitools.model.FormDataFMaplist;
import org.openapitools.model.FormDataFPAct;
import org.openapitools.model.FormDataFPAgoo;
import org.openapitools.model.FormDataFPCifdi;
import org.openapitools.model.FormDataFPDecouple;
import org.openapitools.model.FormDataFPEjscreenOver80cnt;
import org.openapitools.model.FormDataFPFacIco;
import org.openapitools.model.FormDataFPFea;
import org.openapitools.model.FormDataFPFeaa;
import org.openapitools.model.FormDataFPFeay;
import org.openapitools.model.FormDataFPFntype;
import org.openapitools.model.FormDataFPGhgAmt;
import org.openapitools.model.FormDataFPGhgCat;
import org.openapitools.model.FormDataFPIco;
import org.openapitools.model.FormDataFPIea;
import org.openapitools.model.FormDataFPIeaa;
import org.openapitools.model.FormDataFPIeay;
import org.openapitools.model.FormDataFPImpw;
import org.openapitools.model.FormDataFPLimitAddr;
import org.openapitools.model.FormDataFPMaj;
import org.openapitools.model.FormDataFPMed;
import org.openapitools.model.FormDataFPNeiAmt;
import org.openapitools.model.FormDataFPPctrack;
import org.openapitools.model.FormDataFPPd;
import org.openapitools.model.FormDataFPPidall;
import org.openapitools.model.FormDataFPPm;
import org.openapitools.model.FormDataFPPsncq;
import org.openapitools.model.FormDataFPQiv;
import org.openapitools.model.FormDataFPReg;
import org.openapitools.model.FormDataFPStsl;
import org.openapitools.model.FormDataFPStsla;
import org.openapitools.model.FormDataFPStsly;
import org.openapitools.model.FormDataFPSwpa;
import org.openapitools.model.FormDataFPTrep;
import org.openapitools.model.FormDataFPTriAmt;
import org.openapitools.model.FormDataFPTriCat;
import org.openapitools.model.FormDataFPUsmex;
import org.openapitools.model.FormDataFPYsl;
import org.openapitools.model.FormDataFPYsla;
import org.openapitools.model.FormDataFPYsly;
import org.openapitools.model.FormDataFSummarylist;
import org.openapitools.model.FormDataFTablelist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFDescendingConverter")
    Converter<String, FormDataFDescending> formDataFDescendingConverter() {
        return new Converter<String, FormDataFDescending>() {
            @Override
            public FormDataFDescending convert(String source) {
                return FormDataFDescending.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFMaplistConverter")
    Converter<String, FormDataFMaplist> formDataFMaplistConverter() {
        return new Converter<String, FormDataFMaplist>() {
            @Override
            public FormDataFMaplist convert(String source) {
                return FormDataFMaplist.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPActConverter")
    Converter<String, FormDataFPAct> formDataFPActConverter() {
        return new Converter<String, FormDataFPAct>() {
            @Override
            public FormDataFPAct convert(String source) {
                return FormDataFPAct.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPAgooConverter")
    Converter<String, FormDataFPAgoo> formDataFPAgooConverter() {
        return new Converter<String, FormDataFPAgoo>() {
            @Override
            public FormDataFPAgoo convert(String source) {
                return FormDataFPAgoo.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPCifdiConverter")
    Converter<String, FormDataFPCifdi> formDataFPCifdiConverter() {
        return new Converter<String, FormDataFPCifdi>() {
            @Override
            public FormDataFPCifdi convert(String source) {
                return FormDataFPCifdi.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPDecoupleConverter")
    Converter<String, FormDataFPDecouple> formDataFPDecoupleConverter() {
        return new Converter<String, FormDataFPDecouple>() {
            @Override
            public FormDataFPDecouple convert(String source) {
                return FormDataFPDecouple.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPEjscreenOver80cntConverter")
    Converter<String, FormDataFPEjscreenOver80cnt> formDataFPEjscreenOver80cntConverter() {
        return new Converter<String, FormDataFPEjscreenOver80cnt>() {
            @Override
            public FormDataFPEjscreenOver80cnt convert(String source) {
                return FormDataFPEjscreenOver80cnt.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPFacIcoConverter")
    Converter<String, FormDataFPFacIco> formDataFPFacIcoConverter() {
        return new Converter<String, FormDataFPFacIco>() {
            @Override
            public FormDataFPFacIco convert(String source) {
                return FormDataFPFacIco.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPFeaConverter")
    Converter<String, FormDataFPFea> formDataFPFeaConverter() {
        return new Converter<String, FormDataFPFea>() {
            @Override
            public FormDataFPFea convert(String source) {
                return FormDataFPFea.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPFeaaConverter")
    Converter<String, FormDataFPFeaa> formDataFPFeaaConverter() {
        return new Converter<String, FormDataFPFeaa>() {
            @Override
            public FormDataFPFeaa convert(String source) {
                return FormDataFPFeaa.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPFeayConverter")
    Converter<BigDecimal, FormDataFPFeay> formDataFPFeayConverter() {
        return new Converter<BigDecimal, FormDataFPFeay>() {
            @Override
            public FormDataFPFeay convert(BigDecimal source) {
                return FormDataFPFeay.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPFntypeConverter")
    Converter<String, FormDataFPFntype> formDataFPFntypeConverter() {
        return new Converter<String, FormDataFPFntype>() {
            @Override
            public FormDataFPFntype convert(String source) {
                return FormDataFPFntype.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPGhgAmtConverter")
    Converter<String, FormDataFPGhgAmt> formDataFPGhgAmtConverter() {
        return new Converter<String, FormDataFPGhgAmt>() {
            @Override
            public FormDataFPGhgAmt convert(String source) {
                return FormDataFPGhgAmt.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPGhgCatConverter")
    Converter<String, FormDataFPGhgCat> formDataFPGhgCatConverter() {
        return new Converter<String, FormDataFPGhgCat>() {
            @Override
            public FormDataFPGhgCat convert(String source) {
                return FormDataFPGhgCat.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPIcoConverter")
    Converter<String, FormDataFPIco> formDataFPIcoConverter() {
        return new Converter<String, FormDataFPIco>() {
            @Override
            public FormDataFPIco convert(String source) {
                return FormDataFPIco.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPIeaConverter")
    Converter<String, FormDataFPIea> formDataFPIeaConverter() {
        return new Converter<String, FormDataFPIea>() {
            @Override
            public FormDataFPIea convert(String source) {
                return FormDataFPIea.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPIeaaConverter")
    Converter<String, FormDataFPIeaa> formDataFPIeaaConverter() {
        return new Converter<String, FormDataFPIeaa>() {
            @Override
            public FormDataFPIeaa convert(String source) {
                return FormDataFPIeaa.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPIeayConverter")
    Converter<BigDecimal, FormDataFPIeay> formDataFPIeayConverter() {
        return new Converter<BigDecimal, FormDataFPIeay>() {
            @Override
            public FormDataFPIeay convert(BigDecimal source) {
                return FormDataFPIeay.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPImpwConverter")
    Converter<String, FormDataFPImpw> formDataFPImpwConverter() {
        return new Converter<String, FormDataFPImpw>() {
            @Override
            public FormDataFPImpw convert(String source) {
                return FormDataFPImpw.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPLimitAddrConverter")
    Converter<String, FormDataFPLimitAddr> formDataFPLimitAddrConverter() {
        return new Converter<String, FormDataFPLimitAddr>() {
            @Override
            public FormDataFPLimitAddr convert(String source) {
                return FormDataFPLimitAddr.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPMajConverter")
    Converter<String, FormDataFPMaj> formDataFPMajConverter() {
        return new Converter<String, FormDataFPMaj>() {
            @Override
            public FormDataFPMaj convert(String source) {
                return FormDataFPMaj.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPMedConverter")
    Converter<String, FormDataFPMed> formDataFPMedConverter() {
        return new Converter<String, FormDataFPMed>() {
            @Override
            public FormDataFPMed convert(String source) {
                return FormDataFPMed.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPNeiAmtConverter")
    Converter<String, FormDataFPNeiAmt> formDataFPNeiAmtConverter() {
        return new Converter<String, FormDataFPNeiAmt>() {
            @Override
            public FormDataFPNeiAmt convert(String source) {
                return FormDataFPNeiAmt.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPPctrackConverter")
    Converter<String, FormDataFPPctrack> formDataFPPctrackConverter() {
        return new Converter<String, FormDataFPPctrack>() {
            @Override
            public FormDataFPPctrack convert(String source) {
                return FormDataFPPctrack.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPPdConverter")
    Converter<String, FormDataFPPd> formDataFPPdConverter() {
        return new Converter<String, FormDataFPPd>() {
            @Override
            public FormDataFPPd convert(String source) {
                return FormDataFPPd.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPPidallConverter")
    Converter<String, FormDataFPPidall> formDataFPPidallConverter() {
        return new Converter<String, FormDataFPPidall>() {
            @Override
            public FormDataFPPidall convert(String source) {
                return FormDataFPPidall.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPPmConverter")
    Converter<String, FormDataFPPm> formDataFPPmConverter() {
        return new Converter<String, FormDataFPPm>() {
            @Override
            public FormDataFPPm convert(String source) {
                return FormDataFPPm.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPPsncqConverter")
    Converter<String, FormDataFPPsncq> formDataFPPsncqConverter() {
        return new Converter<String, FormDataFPPsncq>() {
            @Override
            public FormDataFPPsncq convert(String source) {
                return FormDataFPPsncq.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPQivConverter")
    Converter<String, FormDataFPQiv> formDataFPQivConverter() {
        return new Converter<String, FormDataFPQiv>() {
            @Override
            public FormDataFPQiv convert(String source) {
                return FormDataFPQiv.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPRegConverter")
    Converter<String, FormDataFPReg> formDataFPRegConverter() {
        return new Converter<String, FormDataFPReg>() {
            @Override
            public FormDataFPReg convert(String source) {
                return FormDataFPReg.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPStslConverter")
    Converter<String, FormDataFPStsl> formDataFPStslConverter() {
        return new Converter<String, FormDataFPStsl>() {
            @Override
            public FormDataFPStsl convert(String source) {
                return FormDataFPStsl.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPStslaConverter")
    Converter<String, FormDataFPStsla> formDataFPStslaConverter() {
        return new Converter<String, FormDataFPStsla>() {
            @Override
            public FormDataFPStsla convert(String source) {
                return FormDataFPStsla.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPStslyConverter")
    Converter<BigDecimal, FormDataFPStsly> formDataFPStslyConverter() {
        return new Converter<BigDecimal, FormDataFPStsly>() {
            @Override
            public FormDataFPStsly convert(BigDecimal source) {
                return FormDataFPStsly.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPSwpaConverter")
    Converter<String, FormDataFPSwpa> formDataFPSwpaConverter() {
        return new Converter<String, FormDataFPSwpa>() {
            @Override
            public FormDataFPSwpa convert(String source) {
                return FormDataFPSwpa.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPTrepConverter")
    Converter<String, FormDataFPTrep> formDataFPTrepConverter() {
        return new Converter<String, FormDataFPTrep>() {
            @Override
            public FormDataFPTrep convert(String source) {
                return FormDataFPTrep.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPTriAmtConverter")
    Converter<String, FormDataFPTriAmt> formDataFPTriAmtConverter() {
        return new Converter<String, FormDataFPTriAmt>() {
            @Override
            public FormDataFPTriAmt convert(String source) {
                return FormDataFPTriAmt.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPTriCatConverter")
    Converter<String, FormDataFPTriCat> formDataFPTriCatConverter() {
        return new Converter<String, FormDataFPTriCat>() {
            @Override
            public FormDataFPTriCat convert(String source) {
                return FormDataFPTriCat.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPUsmexConverter")
    Converter<String, FormDataFPUsmex> formDataFPUsmexConverter() {
        return new Converter<String, FormDataFPUsmex>() {
            @Override
            public FormDataFPUsmex convert(String source) {
                return FormDataFPUsmex.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPYslConverter")
    Converter<String, FormDataFPYsl> formDataFPYslConverter() {
        return new Converter<String, FormDataFPYsl>() {
            @Override
            public FormDataFPYsl convert(String source) {
                return FormDataFPYsl.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPYslaConverter")
    Converter<String, FormDataFPYsla> formDataFPYslaConverter() {
        return new Converter<String, FormDataFPYsla>() {
            @Override
            public FormDataFPYsla convert(String source) {
                return FormDataFPYsla.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFPYslyConverter")
    Converter<BigDecimal, FormDataFPYsly> formDataFPYslyConverter() {
        return new Converter<BigDecimal, FormDataFPYsly>() {
            @Override
            public FormDataFPYsly convert(BigDecimal source) {
                return FormDataFPYsly.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFSummarylistConverter")
    Converter<String, FormDataFSummarylist> formDataFSummarylistConverter() {
        return new Converter<String, FormDataFSummarylist>() {
            @Override
            public FormDataFSummarylist convert(String source) {
                return FormDataFSummarylist.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.formDataFTablelistConverter")
    Converter<String, FormDataFTablelist> formDataFTablelistConverter() {
        return new Converter<String, FormDataFTablelist>() {
            @Override
            public FormDataFTablelist convert(String source) {
                return FormDataFTablelist.fromValue(source);
            }
        };
    }

}
