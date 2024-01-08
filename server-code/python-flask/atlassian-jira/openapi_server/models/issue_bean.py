from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.included_fields import IncludedFields
from openapi_server.models.issue_bean_changelog import IssueBeanChangelog
from openapi_server.models.issue_bean_editmeta import IssueBeanEditmeta
from openapi_server.models.issue_bean_operations import IssueBeanOperations
from openapi_server.models.issue_transition import IssueTransition
from openapi_server.models.json_type_bean import JsonTypeBean
from openapi_server import util

from openapi_server.models.included_fields import IncludedFields  # noqa: E501
from openapi_server.models.issue_bean_changelog import IssueBeanChangelog  # noqa: E501
from openapi_server.models.issue_bean_editmeta import IssueBeanEditmeta  # noqa: E501
from openapi_server.models.issue_bean_operations import IssueBeanOperations  # noqa: E501
from openapi_server.models.issue_transition import IssueTransition  # noqa: E501
from openapi_server.models.json_type_bean import JsonTypeBean  # noqa: E501

class IssueBean(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, changelog=None, editmeta=None, expand=None, fields=None, fields_to_include=None, id=None, key=None, names=None, operations=None, properties=None, rendered_fields=None, _schema=None, _self=None, transitions=None, versioned_representations=None):  # noqa: E501
        """IssueBean - a model defined in OpenAPI

        :param changelog: The changelog of this IssueBean.  # noqa: E501
        :type changelog: IssueBeanChangelog
        :param editmeta: The editmeta of this IssueBean.  # noqa: E501
        :type editmeta: IssueBeanEditmeta
        :param expand: The expand of this IssueBean.  # noqa: E501
        :type expand: str
        :param fields: The fields of this IssueBean.  # noqa: E501
        :type fields: Dict[str, object]
        :param fields_to_include: The fields_to_include of this IssueBean.  # noqa: E501
        :type fields_to_include: IncludedFields
        :param id: The id of this IssueBean.  # noqa: E501
        :type id: str
        :param key: The key of this IssueBean.  # noqa: E501
        :type key: str
        :param names: The names of this IssueBean.  # noqa: E501
        :type names: Dict[str, str]
        :param operations: The operations of this IssueBean.  # noqa: E501
        :type operations: IssueBeanOperations
        :param properties: The properties of this IssueBean.  # noqa: E501
        :type properties: Dict[str, object]
        :param rendered_fields: The rendered_fields of this IssueBean.  # noqa: E501
        :type rendered_fields: Dict[str, object]
        :param _schema: The _schema of this IssueBean.  # noqa: E501
        :type _schema: Dict[str, JsonTypeBean]
        :param _self: The _self of this IssueBean.  # noqa: E501
        :type _self: str
        :param transitions: The transitions of this IssueBean.  # noqa: E501
        :type transitions: List[IssueTransition]
        :param versioned_representations: The versioned_representations of this IssueBean.  # noqa: E501
        :type versioned_representations: Dict[str, Dict[str, object]]
        """
        self.openapi_types = {
            'changelog': IssueBeanChangelog,
            'editmeta': IssueBeanEditmeta,
            'expand': str,
            'fields': Dict[str, object],
            'fields_to_include': IncludedFields,
            'id': str,
            'key': str,
            'names': Dict[str, str],
            'operations': IssueBeanOperations,
            'properties': Dict[str, object],
            'rendered_fields': Dict[str, object],
            '_schema': Dict[str, JsonTypeBean],
            '_self': str,
            'transitions': List[IssueTransition],
            'versioned_representations': Dict[str, Dict[str, object]]
        }

        self.attribute_map = {
            'changelog': 'changelog',
            'editmeta': 'editmeta',
            'expand': 'expand',
            'fields': 'fields',
            'fields_to_include': 'fieldsToInclude',
            'id': 'id',
            'key': 'key',
            'names': 'names',
            'operations': 'operations',
            'properties': 'properties',
            'rendered_fields': 'renderedFields',
            '_schema': 'schema',
            '_self': 'self',
            'transitions': 'transitions',
            'versioned_representations': 'versionedRepresentations'
        }

        self._changelog = changelog
        self._editmeta = editmeta
        self._expand = expand
        self._fields = fields
        self._fields_to_include = fields_to_include
        self._id = id
        self._key = key
        self._names = names
        self._operations = operations
        self._properties = properties
        self._rendered_fields = rendered_fields
        self.__schema = _schema
        self.__self = _self
        self._transitions = transitions
        self._versioned_representations = versioned_representations

    @classmethod
    def from_dict(cls, dikt) -> 'IssueBean':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IssueBean of this IssueBean.  # noqa: E501
        :rtype: IssueBean
        """
        return util.deserialize_model(dikt, cls)

    @property
    def changelog(self) -> IssueBeanChangelog:
        """Gets the changelog of this IssueBean.


        :return: The changelog of this IssueBean.
        :rtype: IssueBeanChangelog
        """
        return self._changelog

    @changelog.setter
    def changelog(self, changelog: IssueBeanChangelog):
        """Sets the changelog of this IssueBean.


        :param changelog: The changelog of this IssueBean.
        :type changelog: IssueBeanChangelog
        """

        self._changelog = changelog

    @property
    def editmeta(self) -> IssueBeanEditmeta:
        """Gets the editmeta of this IssueBean.


        :return: The editmeta of this IssueBean.
        :rtype: IssueBeanEditmeta
        """
        return self._editmeta

    @editmeta.setter
    def editmeta(self, editmeta: IssueBeanEditmeta):
        """Sets the editmeta of this IssueBean.


        :param editmeta: The editmeta of this IssueBean.
        :type editmeta: IssueBeanEditmeta
        """

        self._editmeta = editmeta

    @property
    def expand(self) -> str:
        """Gets the expand of this IssueBean.

        Expand options that include additional issue details in the response.  # noqa: E501

        :return: The expand of this IssueBean.
        :rtype: str
        """
        return self._expand

    @expand.setter
    def expand(self, expand: str):
        """Sets the expand of this IssueBean.

        Expand options that include additional issue details in the response.  # noqa: E501

        :param expand: The expand of this IssueBean.
        :type expand: str
        """

        self._expand = expand

    @property
    def fields(self) -> Dict[str, object]:
        """Gets the fields of this IssueBean.


        :return: The fields of this IssueBean.
        :rtype: Dict[str, object]
        """
        return self._fields

    @fields.setter
    def fields(self, fields: Dict[str, object]):
        """Sets the fields of this IssueBean.


        :param fields: The fields of this IssueBean.
        :type fields: Dict[str, object]
        """

        self._fields = fields

    @property
    def fields_to_include(self) -> IncludedFields:
        """Gets the fields_to_include of this IssueBean.


        :return: The fields_to_include of this IssueBean.
        :rtype: IncludedFields
        """
        return self._fields_to_include

    @fields_to_include.setter
    def fields_to_include(self, fields_to_include: IncludedFields):
        """Sets the fields_to_include of this IssueBean.


        :param fields_to_include: The fields_to_include of this IssueBean.
        :type fields_to_include: IncludedFields
        """

        self._fields_to_include = fields_to_include

    @property
    def id(self) -> str:
        """Gets the id of this IssueBean.

        The ID of the issue.  # noqa: E501

        :return: The id of this IssueBean.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this IssueBean.

        The ID of the issue.  # noqa: E501

        :param id: The id of this IssueBean.
        :type id: str
        """

        self._id = id

    @property
    def key(self) -> str:
        """Gets the key of this IssueBean.

        The key of the issue.  # noqa: E501

        :return: The key of this IssueBean.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this IssueBean.

        The key of the issue.  # noqa: E501

        :param key: The key of this IssueBean.
        :type key: str
        """

        self._key = key

    @property
    def names(self) -> Dict[str, str]:
        """Gets the names of this IssueBean.

        The ID and name of each field present on the issue.  # noqa: E501

        :return: The names of this IssueBean.
        :rtype: Dict[str, str]
        """
        return self._names

    @names.setter
    def names(self, names: Dict[str, str]):
        """Sets the names of this IssueBean.

        The ID and name of each field present on the issue.  # noqa: E501

        :param names: The names of this IssueBean.
        :type names: Dict[str, str]
        """

        self._names = names

    @property
    def operations(self) -> IssueBeanOperations:
        """Gets the operations of this IssueBean.


        :return: The operations of this IssueBean.
        :rtype: IssueBeanOperations
        """
        return self._operations

    @operations.setter
    def operations(self, operations: IssueBeanOperations):
        """Sets the operations of this IssueBean.


        :param operations: The operations of this IssueBean.
        :type operations: IssueBeanOperations
        """

        self._operations = operations

    @property
    def properties(self) -> Dict[str, object]:
        """Gets the properties of this IssueBean.

        Details of the issue properties identified in the request.  # noqa: E501

        :return: The properties of this IssueBean.
        :rtype: Dict[str, object]
        """
        return self._properties

    @properties.setter
    def properties(self, properties: Dict[str, object]):
        """Sets the properties of this IssueBean.

        Details of the issue properties identified in the request.  # noqa: E501

        :param properties: The properties of this IssueBean.
        :type properties: Dict[str, object]
        """

        self._properties = properties

    @property
    def rendered_fields(self) -> Dict[str, object]:
        """Gets the rendered_fields of this IssueBean.

        The rendered value of each field present on the issue.  # noqa: E501

        :return: The rendered_fields of this IssueBean.
        :rtype: Dict[str, object]
        """
        return self._rendered_fields

    @rendered_fields.setter
    def rendered_fields(self, rendered_fields: Dict[str, object]):
        """Sets the rendered_fields of this IssueBean.

        The rendered value of each field present on the issue.  # noqa: E501

        :param rendered_fields: The rendered_fields of this IssueBean.
        :type rendered_fields: Dict[str, object]
        """

        self._rendered_fields = rendered_fields

    @property
    def _schema(self) -> Dict[str, JsonTypeBean]:
        """Gets the _schema of this IssueBean.

        The schema describing each field present on the issue.  # noqa: E501

        :return: The _schema of this IssueBean.
        :rtype: Dict[str, JsonTypeBean]
        """
        return self.__schema

    @_schema.setter
    def _schema(self, _schema: Dict[str, JsonTypeBean]):
        """Sets the _schema of this IssueBean.

        The schema describing each field present on the issue.  # noqa: E501

        :param _schema: The _schema of this IssueBean.
        :type _schema: Dict[str, JsonTypeBean]
        """

        self.__schema = _schema

    @property
    def _self(self) -> str:
        """Gets the _self of this IssueBean.

        The URL of the issue details.  # noqa: E501

        :return: The _self of this IssueBean.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this IssueBean.

        The URL of the issue details.  # noqa: E501

        :param _self: The _self of this IssueBean.
        :type _self: str
        """

        self.__self = _self

    @property
    def transitions(self) -> List[IssueTransition]:
        """Gets the transitions of this IssueBean.

        The transitions that can be performed on the issue.  # noqa: E501

        :return: The transitions of this IssueBean.
        :rtype: List[IssueTransition]
        """
        return self._transitions

    @transitions.setter
    def transitions(self, transitions: List[IssueTransition]):
        """Sets the transitions of this IssueBean.

        The transitions that can be performed on the issue.  # noqa: E501

        :param transitions: The transitions of this IssueBean.
        :type transitions: List[IssueTransition]
        """

        self._transitions = transitions

    @property
    def versioned_representations(self) -> Dict[str, Dict[str, object]]:
        """Gets the versioned_representations of this IssueBean.

        The versions of each field on the issue.  # noqa: E501

        :return: The versioned_representations of this IssueBean.
        :rtype: Dict[str, Dict[str, object]]
        """
        return self._versioned_representations

    @versioned_representations.setter
    def versioned_representations(self, versioned_representations: Dict[str, Dict[str, object]]):
        """Sets the versioned_representations of this IssueBean.

        The versions of each field on the issue.  # noqa: E501

        :param versioned_representations: The versioned_representations of this IssueBean.
        :type versioned_representations: Dict[str, Dict[str, object]]
        """

        self._versioned_representations = versioned_representations