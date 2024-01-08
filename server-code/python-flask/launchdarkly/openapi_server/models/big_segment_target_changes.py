from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BigSegmentTargetChanges(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, add=None, remove=None):  # noqa: E501
        """BigSegmentTargetChanges - a model defined in OpenAPI

        :param add: The add of this BigSegmentTargetChanges.  # noqa: E501
        :type add: List[str]
        :param remove: The remove of this BigSegmentTargetChanges.  # noqa: E501
        :type remove: List[str]
        """
        self.openapi_types = {
            'add': List[str],
            'remove': List[str]
        }

        self.attribute_map = {
            'add': 'add',
            'remove': 'remove'
        }

        self._add = add
        self._remove = remove

    @classmethod
    def from_dict(cls, dikt) -> 'BigSegmentTargetChanges':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BigSegmentTargetChanges of this BigSegmentTargetChanges.  # noqa: E501
        :rtype: BigSegmentTargetChanges
        """
        return util.deserialize_model(dikt, cls)

    @property
    def add(self) -> List[str]:
        """Gets the add of this BigSegmentTargetChanges.

        Users to add to this list of targets  # noqa: E501

        :return: The add of this BigSegmentTargetChanges.
        :rtype: List[str]
        """
        return self._add

    @add.setter
    def add(self, add: List[str]):
        """Sets the add of this BigSegmentTargetChanges.

        Users to add to this list of targets  # noqa: E501

        :param add: The add of this BigSegmentTargetChanges.
        :type add: List[str]
        """

        self._add = add

    @property
    def remove(self) -> List[str]:
        """Gets the remove of this BigSegmentTargetChanges.

        Users to remove from this list of targets  # noqa: E501

        :return: The remove of this BigSegmentTargetChanges.
        :rtype: List[str]
        """
        return self._remove

    @remove.setter
    def remove(self, remove: List[str]):
        """Sets the remove of this BigSegmentTargetChanges.

        Users to remove from this list of targets  # noqa: E501

        :param remove: The remove of this BigSegmentTargetChanges.
        :type remove: List[str]
        """

        self._remove = remove