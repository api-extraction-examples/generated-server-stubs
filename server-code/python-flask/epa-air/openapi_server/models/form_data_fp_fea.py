from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class FormDataFPFea(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    W = 'W'
    N = 'N'
    def __init__(self):  # noqa: E501
        """FormDataFPFea - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'FormDataFPFea':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The formData_f.p_fea of this FormDataFPFea.  # noqa: E501
        :rtype: FormDataFPFea
        """
        return util.deserialize_model(dikt, cls)
