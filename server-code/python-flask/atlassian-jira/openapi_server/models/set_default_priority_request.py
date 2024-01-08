from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SetDefaultPriorityRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None):  # noqa: E501
        """SetDefaultPriorityRequest - a model defined in OpenAPI

        :param id: The id of this SetDefaultPriorityRequest.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'SetDefaultPriorityRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SetDefaultPriorityRequest of this SetDefaultPriorityRequest.  # noqa: E501
        :rtype: SetDefaultPriorityRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this SetDefaultPriorityRequest.

        The ID of the new default issue priority. Must be an existing ID or null. Setting this to null erases the default priority setting.  # noqa: E501

        :return: The id of this SetDefaultPriorityRequest.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this SetDefaultPriorityRequest.

        The ID of the new default issue priority. Must be an existing ID or null. Setting this to null erases the default priority setting.  # noqa: E501

        :param id: The id of this SetDefaultPriorityRequest.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id
