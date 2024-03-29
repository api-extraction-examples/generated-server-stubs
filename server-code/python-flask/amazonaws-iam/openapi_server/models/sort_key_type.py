from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SortKeyType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    SERVICE_NAMESPACE_ASCENDING = 'SERVICE_NAMESPACE_ASCENDING'
    SERVICE_NAMESPACE_DESCENDING = 'SERVICE_NAMESPACE_DESCENDING'
    LAST_AUTHENTICATED_TIME_ASCENDING = 'LAST_AUTHENTICATED_TIME_ASCENDING'
    LAST_AUTHENTICATED_TIME_DESCENDING = 'LAST_AUTHENTICATED_TIME_DESCENDING'
    def __init__(self):  # noqa: E501
        """SortKeyType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'SortKeyType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The sortKeyType of this SortKeyType.  # noqa: E501
        :rtype: SortKeyType
        """
        return util.deserialize_model(dikt, cls)
