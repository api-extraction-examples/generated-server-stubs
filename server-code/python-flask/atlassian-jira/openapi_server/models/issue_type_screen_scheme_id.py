from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class IssueTypeScreenSchemeId(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None):  # noqa: E501
        """IssueTypeScreenSchemeId - a model defined in OpenAPI

        :param id: The id of this IssueTypeScreenSchemeId.  # noqa: E501
        :type id: str
        """
        self.openapi_types = {
            'id': str
        }

        self.attribute_map = {
            'id': 'id'
        }

        self._id = id

    @classmethod
    def from_dict(cls, dikt) -> 'IssueTypeScreenSchemeId':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IssueTypeScreenSchemeId of this IssueTypeScreenSchemeId.  # noqa: E501
        :rtype: IssueTypeScreenSchemeId
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this IssueTypeScreenSchemeId.

        The ID of the issue type screen scheme.  # noqa: E501

        :return: The id of this IssueTypeScreenSchemeId.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this IssueTypeScreenSchemeId.

        The ID of the issue type screen scheme.  # noqa: E501

        :param id: The id of this IssueTypeScreenSchemeId.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id
