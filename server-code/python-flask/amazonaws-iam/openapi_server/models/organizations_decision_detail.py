from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class OrganizationsDecisionDetail(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, allowed_by_organizations=None):  # noqa: E501
        """OrganizationsDecisionDetail - a model defined in OpenAPI

        :param allowed_by_organizations: The allowed_by_organizations of this OrganizationsDecisionDetail.  # noqa: E501
        :type allowed_by_organizations: bool
        """
        self.openapi_types = {
            'allowed_by_organizations': bool
        }

        self.attribute_map = {
            'allowed_by_organizations': 'AllowedByOrganizations'
        }

        self._allowed_by_organizations = allowed_by_organizations

    @classmethod
    def from_dict(cls, dikt) -> 'OrganizationsDecisionDetail':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrganizationsDecisionDetail of this OrganizationsDecisionDetail.  # noqa: E501
        :rtype: OrganizationsDecisionDetail
        """
        return util.deserialize_model(dikt, cls)

    @property
    def allowed_by_organizations(self) -> bool:
        """Gets the allowed_by_organizations of this OrganizationsDecisionDetail.


        :return: The allowed_by_organizations of this OrganizationsDecisionDetail.
        :rtype: bool
        """
        return self._allowed_by_organizations

    @allowed_by_organizations.setter
    def allowed_by_organizations(self, allowed_by_organizations: bool):
        """Sets the allowed_by_organizations of this OrganizationsDecisionDetail.


        :param allowed_by_organizations: The allowed_by_organizations of this OrganizationsDecisionDetail.
        :type allowed_by_organizations: bool
        """

        self._allowed_by_organizations = allowed_by_organizations
