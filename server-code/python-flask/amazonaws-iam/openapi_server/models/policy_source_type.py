from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PolicySourceType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    USER = 'user'
    GROUP = 'group'
    ROLE = 'role'
    AWS_MINUS_MANAGED = 'aws-managed'
    USER_MINUS_MANAGED = 'user-managed'
    RESOURCE = 'resource'
    NONE = 'none'
    def __init__(self):  # noqa: E501
        """PolicySourceType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'PolicySourceType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PolicySourceType of this PolicySourceType.  # noqa: E501
        :rtype: PolicySourceType
        """
        return util.deserialize_model(dikt, cls)
