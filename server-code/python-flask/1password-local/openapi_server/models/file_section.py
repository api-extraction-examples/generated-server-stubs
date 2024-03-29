from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class FileSection(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None):  # noqa: E501
        """FileSection - a model defined in OpenAPI

        :param id: The id of this FileSection.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'FileSection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The File_section of this FileSection.  # noqa: E501
        :rtype: FileSection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this FileSection.


        :return: The id of this FileSection.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this FileSection.


        :param id: The id of this FileSection.
        :type id: str
        """

        self._id = id
