from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class LogLevel(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    TRACE = 'Trace'
    DEBUG = 'Debug'
    INFORMATION = 'Information'
    WARNING = 'Warning'
    ERROR = 'Error'
    CRITICAL = 'Critical'
    NONE = 'None'
    def __init__(self):  # noqa: E501
        """LogLevel - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'LogLevel':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The LogLevel of this LogLevel.  # noqa: E501
        :rtype: LogLevel
        """
        return util.deserialize_model(dikt, cls)
