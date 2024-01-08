from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Form(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, created_at=None, fields=None, id=None, name=None, paths=None, site_id=None, submission_count=None):  # noqa: E501
        """Form - a model defined in OpenAPI

        :param created_at: The created_at of this Form.  # noqa: E501
        :type created_at: str
        :param fields: The fields of this Form.  # noqa: E501
        :type fields: List[object]
        :param id: The id of this Form.  # noqa: E501
        :type id: str
        :param name: The name of this Form.  # noqa: E501
        :type name: str
        :param paths: The paths of this Form.  # noqa: E501
        :type paths: List[str]
        :param site_id: The site_id of this Form.  # noqa: E501
        :type site_id: str
        :param submission_count: The submission_count of this Form.  # noqa: E501
        :type submission_count: int
        """
        self.openapi_types = {
            'created_at': str,
            'fields': List[object],
            'id': str,
            'name': str,
            'paths': List[str],
            'site_id': str,
            'submission_count': int
        }

        self.attribute_map = {
            'created_at': 'created_at',
            'fields': 'fields',
            'id': 'id',
            'name': 'name',
            'paths': 'paths',
            'site_id': 'site_id',
            'submission_count': 'submission_count'
        }

        self._created_at = created_at
        self._fields = fields
        self._id = id
        self._name = name
        self._paths = paths
        self._site_id = site_id
        self._submission_count = submission_count

    @classmethod
    def from_dict(cls, dikt) -> 'Form':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The form of this Form.  # noqa: E501
        :rtype: Form
        """
        return util.deserialize_model(dikt, cls)

    @property
    def created_at(self) -> str:
        """Gets the created_at of this Form.


        :return: The created_at of this Form.
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: str):
        """Sets the created_at of this Form.


        :param created_at: The created_at of this Form.
        :type created_at: str
        """

        self._created_at = created_at

    @property
    def fields(self) -> List[object]:
        """Gets the fields of this Form.


        :return: The fields of this Form.
        :rtype: List[object]
        """
        return self._fields

    @fields.setter
    def fields(self, fields: List[object]):
        """Sets the fields of this Form.


        :param fields: The fields of this Form.
        :type fields: List[object]
        """

        self._fields = fields

    @property
    def id(self) -> str:
        """Gets the id of this Form.


        :return: The id of this Form.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Form.


        :param id: The id of this Form.
        :type id: str
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this Form.


        :return: The name of this Form.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Form.


        :param name: The name of this Form.
        :type name: str
        """

        self._name = name

    @property
    def paths(self) -> List[str]:
        """Gets the paths of this Form.


        :return: The paths of this Form.
        :rtype: List[str]
        """
        return self._paths

    @paths.setter
    def paths(self, paths: List[str]):
        """Sets the paths of this Form.


        :param paths: The paths of this Form.
        :type paths: List[str]
        """

        self._paths = paths

    @property
    def site_id(self) -> str:
        """Gets the site_id of this Form.


        :return: The site_id of this Form.
        :rtype: str
        """
        return self._site_id

    @site_id.setter
    def site_id(self, site_id: str):
        """Sets the site_id of this Form.


        :param site_id: The site_id of this Form.
        :type site_id: str
        """

        self._site_id = site_id

    @property
    def submission_count(self) -> int:
        """Gets the submission_count of this Form.


        :return: The submission_count of this Form.
        :rtype: int
        """
        return self._submission_count

    @submission_count.setter
    def submission_count(self, submission_count: int):
        """Sets the submission_count of this Form.


        :param submission_count: The submission_count of this Form.
        :type submission_count: int
        """

        self._submission_count = submission_count
