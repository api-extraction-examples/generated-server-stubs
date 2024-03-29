from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PolicyScopeType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    ALL = 'All'
    AWS = 'AWS'
    LOCAL = 'Local'
    def __init__(self):  # noqa: E501
        """PolicyScopeType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'PolicyScopeType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The policyScopeType of this PolicyScopeType.  # noqa: E501
        :rtype: PolicyScopeType
        """
        return util.deserialize_model(dikt, cls)
