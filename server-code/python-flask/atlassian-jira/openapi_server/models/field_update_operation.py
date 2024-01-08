from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class FieldUpdateOperation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, add=None, copy=None, edit=None, remove=None, set=None):  # noqa: E501
        """FieldUpdateOperation - a model defined in OpenAPI

        :param add: The add of this FieldUpdateOperation.  # noqa: E501
        :type add: object
        :param copy: The copy of this FieldUpdateOperation.  # noqa: E501
        :type copy: object
        :param edit: The edit of this FieldUpdateOperation.  # noqa: E501
        :type edit: object
        :param remove: The remove of this FieldUpdateOperation.  # noqa: E501
        :type remove: object
        :param set: The set of this FieldUpdateOperation.  # noqa: E501
        :type set: object
        """
        self.openapi_types = {
            'add': object,
            'copy': object,
            'edit': object,
            'remove': object,
            'set': object
        }

        self.attribute_map = {
            'add': 'add',
            'copy': 'copy',
            'edit': 'edit',
            'remove': 'remove',
            'set': 'set'
        }

        self._add = add
        self._copy = copy
        self._edit = edit
        self._remove = remove
        self._set = set

    @classmethod
    def from_dict(cls, dikt) -> 'FieldUpdateOperation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FieldUpdateOperation of this FieldUpdateOperation.  # noqa: E501
        :rtype: FieldUpdateOperation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def add(self) -> object:
        """Gets the add of this FieldUpdateOperation.

        The value to add to the field.  # noqa: E501

        :return: The add of this FieldUpdateOperation.
        :rtype: object
        """
        return self._add

    @add.setter
    def add(self, add: object):
        """Sets the add of this FieldUpdateOperation.

        The value to add to the field.  # noqa: E501

        :param add: The add of this FieldUpdateOperation.
        :type add: object
        """

        self._add = add

    @property
    def copy(self) -> object:
        """Gets the copy of this FieldUpdateOperation.

        The field value to copy from another issue.  # noqa: E501

        :return: The copy of this FieldUpdateOperation.
        :rtype: object
        """
        return self._copy

    @copy.setter
    def copy(self, copy: object):
        """Sets the copy of this FieldUpdateOperation.

        The field value to copy from another issue.  # noqa: E501

        :param copy: The copy of this FieldUpdateOperation.
        :type copy: object
        """

        self._copy = copy

    @property
    def edit(self) -> object:
        """Gets the edit of this FieldUpdateOperation.

        The value to edit in the field.  # noqa: E501

        :return: The edit of this FieldUpdateOperation.
        :rtype: object
        """
        return self._edit

    @edit.setter
    def edit(self, edit: object):
        """Sets the edit of this FieldUpdateOperation.

        The value to edit in the field.  # noqa: E501

        :param edit: The edit of this FieldUpdateOperation.
        :type edit: object
        """

        self._edit = edit

    @property
    def remove(self) -> object:
        """Gets the remove of this FieldUpdateOperation.

        The value to removed from the field.  # noqa: E501

        :return: The remove of this FieldUpdateOperation.
        :rtype: object
        """
        return self._remove

    @remove.setter
    def remove(self, remove: object):
        """Sets the remove of this FieldUpdateOperation.

        The value to removed from the field.  # noqa: E501

        :param remove: The remove of this FieldUpdateOperation.
        :type remove: object
        """

        self._remove = remove

    @property
    def set(self) -> object:
        """Gets the set of this FieldUpdateOperation.

        The value to set in the field.  # noqa: E501

        :return: The set of this FieldUpdateOperation.
        :rtype: object
        """
        return self._set

    @set.setter
    def set(self, set: object):
        """Sets the set of this FieldUpdateOperation.

        The value to set in the field.  # noqa: E501

        :param set: The set of this FieldUpdateOperation.
        :type set: object
        """

        self._set = set
