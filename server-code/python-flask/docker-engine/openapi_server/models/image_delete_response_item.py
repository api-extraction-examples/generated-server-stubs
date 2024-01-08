from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ImageDeleteResponseItem(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, deleted=None, untagged=None):  # noqa: E501
        """ImageDeleteResponseItem - a model defined in OpenAPI

        :param deleted: The deleted of this ImageDeleteResponseItem.  # noqa: E501
        :type deleted: str
        :param untagged: The untagged of this ImageDeleteResponseItem.  # noqa: E501
        :type untagged: str
        """
        self.openapi_types = {
            'deleted': str,
            'untagged': str
        }

        self.attribute_map = {
            'deleted': 'Deleted',
            'untagged': 'Untagged'
        }

        self._deleted = deleted
        self._untagged = untagged

    @classmethod
    def from_dict(cls, dikt) -> 'ImageDeleteResponseItem':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ImageDeleteResponseItem of this ImageDeleteResponseItem.  # noqa: E501
        :rtype: ImageDeleteResponseItem
        """
        return util.deserialize_model(dikt, cls)

    @property
    def deleted(self) -> str:
        """Gets the deleted of this ImageDeleteResponseItem.

        The image ID of an image that was deleted  # noqa: E501

        :return: The deleted of this ImageDeleteResponseItem.
        :rtype: str
        """
        return self._deleted

    @deleted.setter
    def deleted(self, deleted: str):
        """Sets the deleted of this ImageDeleteResponseItem.

        The image ID of an image that was deleted  # noqa: E501

        :param deleted: The deleted of this ImageDeleteResponseItem.
        :type deleted: str
        """

        self._deleted = deleted

    @property
    def untagged(self) -> str:
        """Gets the untagged of this ImageDeleteResponseItem.

        The image ID of an image that was untagged  # noqa: E501

        :return: The untagged of this ImageDeleteResponseItem.
        :rtype: str
        """
        return self._untagged

    @untagged.setter
    def untagged(self, untagged: str):
        """Sets the untagged of this ImageDeleteResponseItem.

        The image ID of an image that was untagged  # noqa: E501

        :param untagged: The untagged of this ImageDeleteResponseItem.
        :type untagged: str
        """

        self._untagged = untagged