from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class FormDataFPGhgCat(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    ALL = 'ALL'
    BIOCO2 = 'BIOCO2'
    CH4 = 'CH4'
    CO2 = 'CO2'
    HFC = 'HFC'
    N2O = 'N2O'
    NF3 = 'NF3'
    OTHER_L = 'OTHER_L'
    PFC = 'PFC'
    SF6 = 'SF6'
    def __init__(self):  # noqa: E501
        """FormDataFPGhgCat - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'FormDataFPGhgCat':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The formData_f.p_ghg_cat of this FormDataFPGhgCat.  # noqa: E501
        :rtype: FormDataFPGhgCat
        """
        return util.deserialize_model(dikt, cls)
