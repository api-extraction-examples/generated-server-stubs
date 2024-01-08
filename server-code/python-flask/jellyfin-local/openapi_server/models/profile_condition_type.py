from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ProfileConditionType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    EQUALS = 'Equals'
    NOTEQUALS = 'NotEquals'
    LESSTHANEQUAL = 'LessThanEqual'
    GREATERTHANEQUAL = 'GreaterThanEqual'
    EQUALSANY = 'EqualsAny'
    def __init__(self):  # noqa: E501
        """ProfileConditionType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ProfileConditionType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProfileConditionType of this ProfileConditionType.  # noqa: E501
        :rtype: ProfileConditionType
        """
        return util.deserialize_model(dikt, cls)
