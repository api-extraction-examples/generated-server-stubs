from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class FormDataFPYsl(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    W = 'W'
    N = 'N'
    NV = 'NV'
    def __init__(self):  # noqa: E501
        """FormDataFPYsl - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'FormDataFPYsl':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The formData_f.p_ysl of this FormDataFPYsl.  # noqa: E501
        :rtype: FormDataFPYsl
        """
        return util.deserialize_model(dikt, cls)
