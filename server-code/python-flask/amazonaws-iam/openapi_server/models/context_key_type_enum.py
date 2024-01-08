from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ContextKeyTypeEnum(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    STRING = 'string'
    STRINGLIST = 'stringList'
    NUMERIC = 'numeric'
    NUMERICLIST = 'numericList'
    BOOLEAN = 'boolean'
    BOOLEANLIST = 'booleanList'
    IP = 'ip'
    IPLIST = 'ipList'
    BINARY = 'binary'
    BINARYLIST = 'binaryList'
    DATE = 'date'
    DATELIST = 'dateList'
    def __init__(self):  # noqa: E501
        """ContextKeyTypeEnum - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ContextKeyTypeEnum':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ContextKeyTypeEnum of this ContextKeyTypeEnum.  # noqa: E501
        :rtype: ContextKeyTypeEnum
        """
        return util.deserialize_model(dikt, cls)
