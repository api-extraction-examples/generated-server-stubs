from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BillSortOrder(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    TITLEASCENDING = 'TitleAscending'
    TITLEDESCENDING = 'TitleDescending'
    DATEUPDATEDASCENDING = 'DateUpdatedAscending'
    DATEUPDATEDDESCENDING = 'DateUpdatedDescending'
    def __init__(self):  # noqa: E501
        """BillSortOrder - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'BillSortOrder':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BillSortOrder of this BillSortOrder.  # noqa: E501
        :rtype: BillSortOrder
        """
        return util.deserialize_model(dikt, cls)
