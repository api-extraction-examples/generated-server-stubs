from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BetaGroupAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, created_date=None, feedback_enabled=None, is_internal_group=None, name=None, public_link=None, public_link_enabled=None, public_link_id=None, public_link_limit=None, public_link_limit_enabled=None):  # noqa: E501
        """BetaGroupAttributes - a model defined in OpenAPI

        :param created_date: The created_date of this BetaGroupAttributes.  # noqa: E501
        :type created_date: datetime
        :param feedback_enabled: The feedback_enabled of this BetaGroupAttributes.  # noqa: E501
        :type feedback_enabled: bool
        :param is_internal_group: The is_internal_group of this BetaGroupAttributes.  # noqa: E501
        :type is_internal_group: bool
        :param name: The name of this BetaGroupAttributes.  # noqa: E501
        :type name: str
        :param public_link: The public_link of this BetaGroupAttributes.  # noqa: E501
        :type public_link: str
        :param public_link_enabled: The public_link_enabled of this BetaGroupAttributes.  # noqa: E501
        :type public_link_enabled: bool
        :param public_link_id: The public_link_id of this BetaGroupAttributes.  # noqa: E501
        :type public_link_id: str
        :param public_link_limit: The public_link_limit of this BetaGroupAttributes.  # noqa: E501
        :type public_link_limit: int
        :param public_link_limit_enabled: The public_link_limit_enabled of this BetaGroupAttributes.  # noqa: E501
        :type public_link_limit_enabled: bool
        """
        self.openapi_types = {
            'created_date': datetime,
            'feedback_enabled': bool,
            'is_internal_group': bool,
            'name': str,
            'public_link': str,
            'public_link_enabled': bool,
            'public_link_id': str,
            'public_link_limit': int,
            'public_link_limit_enabled': bool
        }

        self.attribute_map = {
            'created_date': 'createdDate',
            'feedback_enabled': 'feedbackEnabled',
            'is_internal_group': 'isInternalGroup',
            'name': 'name',
            'public_link': 'publicLink',
            'public_link_enabled': 'publicLinkEnabled',
            'public_link_id': 'publicLinkId',
            'public_link_limit': 'publicLinkLimit',
            'public_link_limit_enabled': 'publicLinkLimitEnabled'
        }

        self._created_date = created_date
        self._feedback_enabled = feedback_enabled
        self._is_internal_group = is_internal_group
        self._name = name
        self._public_link = public_link
        self._public_link_enabled = public_link_enabled
        self._public_link_id = public_link_id
        self._public_link_limit = public_link_limit
        self._public_link_limit_enabled = public_link_limit_enabled

    @classmethod
    def from_dict(cls, dikt) -> 'BetaGroupAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaGroup_attributes of this BetaGroupAttributes.  # noqa: E501
        :rtype: BetaGroupAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def created_date(self) -> datetime:
        """Gets the created_date of this BetaGroupAttributes.


        :return: The created_date of this BetaGroupAttributes.
        :rtype: datetime
        """
        return self._created_date

    @created_date.setter
    def created_date(self, created_date: datetime):
        """Sets the created_date of this BetaGroupAttributes.


        :param created_date: The created_date of this BetaGroupAttributes.
        :type created_date: datetime
        """

        self._created_date = created_date

    @property
    def feedback_enabled(self) -> bool:
        """Gets the feedback_enabled of this BetaGroupAttributes.


        :return: The feedback_enabled of this BetaGroupAttributes.
        :rtype: bool
        """
        return self._feedback_enabled

    @feedback_enabled.setter
    def feedback_enabled(self, feedback_enabled: bool):
        """Sets the feedback_enabled of this BetaGroupAttributes.


        :param feedback_enabled: The feedback_enabled of this BetaGroupAttributes.
        :type feedback_enabled: bool
        """

        self._feedback_enabled = feedback_enabled

    @property
    def is_internal_group(self) -> bool:
        """Gets the is_internal_group of this BetaGroupAttributes.


        :return: The is_internal_group of this BetaGroupAttributes.
        :rtype: bool
        """
        return self._is_internal_group

    @is_internal_group.setter
    def is_internal_group(self, is_internal_group: bool):
        """Sets the is_internal_group of this BetaGroupAttributes.


        :param is_internal_group: The is_internal_group of this BetaGroupAttributes.
        :type is_internal_group: bool
        """

        self._is_internal_group = is_internal_group

    @property
    def name(self) -> str:
        """Gets the name of this BetaGroupAttributes.


        :return: The name of this BetaGroupAttributes.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this BetaGroupAttributes.


        :param name: The name of this BetaGroupAttributes.
        :type name: str
        """

        self._name = name

    @property
    def public_link(self) -> str:
        """Gets the public_link of this BetaGroupAttributes.


        :return: The public_link of this BetaGroupAttributes.
        :rtype: str
        """
        return self._public_link

    @public_link.setter
    def public_link(self, public_link: str):
        """Sets the public_link of this BetaGroupAttributes.


        :param public_link: The public_link of this BetaGroupAttributes.
        :type public_link: str
        """

        self._public_link = public_link

    @property
    def public_link_enabled(self) -> bool:
        """Gets the public_link_enabled of this BetaGroupAttributes.


        :return: The public_link_enabled of this BetaGroupAttributes.
        :rtype: bool
        """
        return self._public_link_enabled

    @public_link_enabled.setter
    def public_link_enabled(self, public_link_enabled: bool):
        """Sets the public_link_enabled of this BetaGroupAttributes.


        :param public_link_enabled: The public_link_enabled of this BetaGroupAttributes.
        :type public_link_enabled: bool
        """

        self._public_link_enabled = public_link_enabled

    @property
    def public_link_id(self) -> str:
        """Gets the public_link_id of this BetaGroupAttributes.


        :return: The public_link_id of this BetaGroupAttributes.
        :rtype: str
        """
        return self._public_link_id

    @public_link_id.setter
    def public_link_id(self, public_link_id: str):
        """Sets the public_link_id of this BetaGroupAttributes.


        :param public_link_id: The public_link_id of this BetaGroupAttributes.
        :type public_link_id: str
        """

        self._public_link_id = public_link_id

    @property
    def public_link_limit(self) -> int:
        """Gets the public_link_limit of this BetaGroupAttributes.


        :return: The public_link_limit of this BetaGroupAttributes.
        :rtype: int
        """
        return self._public_link_limit

    @public_link_limit.setter
    def public_link_limit(self, public_link_limit: int):
        """Sets the public_link_limit of this BetaGroupAttributes.


        :param public_link_limit: The public_link_limit of this BetaGroupAttributes.
        :type public_link_limit: int
        """

        self._public_link_limit = public_link_limit

    @property
    def public_link_limit_enabled(self) -> bool:
        """Gets the public_link_limit_enabled of this BetaGroupAttributes.


        :return: The public_link_limit_enabled of this BetaGroupAttributes.
        :rtype: bool
        """
        return self._public_link_limit_enabled

    @public_link_limit_enabled.setter
    def public_link_limit_enabled(self, public_link_limit_enabled: bool):
        """Sets the public_link_limit_enabled of this BetaGroupAttributes.


        :param public_link_limit_enabled: The public_link_limit_enabled of this BetaGroupAttributes.
        :type public_link_limit_enabled: bool
        """

        self._public_link_limit_enabled = public_link_limit_enabled