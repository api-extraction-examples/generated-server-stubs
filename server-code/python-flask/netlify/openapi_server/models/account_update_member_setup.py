from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AccountUpdateMemberSetup(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, role=None, site_access=None, site_ids=None):  # noqa: E501
        """AccountUpdateMemberSetup - a model defined in OpenAPI

        :param role: The role of this AccountUpdateMemberSetup.  # noqa: E501
        :type role: str
        :param site_access: The site_access of this AccountUpdateMemberSetup.  # noqa: E501
        :type site_access: str
        :param site_ids: The site_ids of this AccountUpdateMemberSetup.  # noqa: E501
        :type site_ids: List[str]
        """
        self.openapi_types = {
            'role': str,
            'site_access': str,
            'site_ids': List[str]
        }

        self.attribute_map = {
            'role': 'role',
            'site_access': 'site_access',
            'site_ids': 'site_ids'
        }

        self._role = role
        self._site_access = site_access
        self._site_ids = site_ids

    @classmethod
    def from_dict(cls, dikt) -> 'AccountUpdateMemberSetup':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The accountUpdateMemberSetup of this AccountUpdateMemberSetup.  # noqa: E501
        :rtype: AccountUpdateMemberSetup
        """
        return util.deserialize_model(dikt, cls)

    @property
    def role(self) -> str:
        """Gets the role of this AccountUpdateMemberSetup.


        :return: The role of this AccountUpdateMemberSetup.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role: str):
        """Sets the role of this AccountUpdateMemberSetup.


        :param role: The role of this AccountUpdateMemberSetup.
        :type role: str
        """
        allowed_values = ["Owner", "Collaborator", "Controller"]  # noqa: E501
        if role not in allowed_values:
            raise ValueError(
                "Invalid value for `role` ({0}), must be one of {1}"
                .format(role, allowed_values)
            )

        self._role = role

    @property
    def site_access(self) -> str:
        """Gets the site_access of this AccountUpdateMemberSetup.


        :return: The site_access of this AccountUpdateMemberSetup.
        :rtype: str
        """
        return self._site_access

    @site_access.setter
    def site_access(self, site_access: str):
        """Sets the site_access of this AccountUpdateMemberSetup.


        :param site_access: The site_access of this AccountUpdateMemberSetup.
        :type site_access: str
        """
        allowed_values = ["all", "none", "selected"]  # noqa: E501
        if site_access not in allowed_values:
            raise ValueError(
                "Invalid value for `site_access` ({0}), must be one of {1}"
                .format(site_access, allowed_values)
            )

        self._site_access = site_access

    @property
    def site_ids(self) -> List[str]:
        """Gets the site_ids of this AccountUpdateMemberSetup.


        :return: The site_ids of this AccountUpdateMemberSetup.
        :rtype: List[str]
        """
        return self._site_ids

    @site_ids.setter
    def site_ids(self, site_ids: List[str]):
        """Sets the site_ids of this AccountUpdateMemberSetup.


        :param site_ids: The site_ids of this AccountUpdateMemberSetup.
        :type site_ids: List[str]
        """

        self._site_ids = site_ids