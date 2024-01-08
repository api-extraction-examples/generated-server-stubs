from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class FormDataFPSwpa(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    SOURCE_WATER = 'source water'
    SURFACE_WATER = 'surface water'
    GROUND_WATER = 'ground water'
    WAITING_FOR_SSO = 'waiting for SSO'
    def __init__(self):  # noqa: E501
        """FormDataFPSwpa - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'FormDataFPSwpa':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The formData_f.p_swpa of this FormDataFPSwpa.  # noqa: E501
        :rtype: FormDataFPSwpa
        """
        return util.deserialize_model(dikt, cls)