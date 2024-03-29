from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class FormDataFPPsncq(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    GT1 = 'GT1'
    GE1 = 'GE1'
    GT2 = 'GT2'
    GE2 = 'GE2'
    GT4 = 'GT4'
    GE4 = 'GE4'
    GT8 = 'GT8'
    GE8 = 'GE8'
    GT12 = 'GT12'
    GE12 = 'GE12'
    def __init__(self):  # noqa: E501
        """FormDataFPPsncq - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'FormDataFPPsncq':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The formData_f.p_psncq of this FormDataFPPsncq.  # noqa: E501
        :rtype: FormDataFPPsncq
        """
        return util.deserialize_model(dikt, cls)
