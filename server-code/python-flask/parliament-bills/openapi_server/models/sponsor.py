from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.member import Member
from openapi_server.models.organisation import Organisation
from openapi_server import util

from openapi_server.models.member import Member  # noqa: E501
from openapi_server.models.organisation import Organisation  # noqa: E501

class Sponsor(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, member=None, organisation=None, sort_order=None):  # noqa: E501
        """Sponsor - a model defined in OpenAPI

        :param member: The member of this Sponsor.  # noqa: E501
        :type member: Member
        :param organisation: The organisation of this Sponsor.  # noqa: E501
        :type organisation: Organisation
        :param sort_order: The sort_order of this Sponsor.  # noqa: E501
        :type sort_order: int
        """
        self.openapi_types = {
            'member': Member,
            'organisation': Organisation,
            'sort_order': int
        }

        self.attribute_map = {
            'member': 'member',
            'organisation': 'organisation',
            'sort_order': 'sortOrder'
        }

        self._member = member
        self._organisation = organisation
        self._sort_order = sort_order

    @classmethod
    def from_dict(cls, dikt) -> 'Sponsor':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Sponsor of this Sponsor.  # noqa: E501
        :rtype: Sponsor
        """
        return util.deserialize_model(dikt, cls)

    @property
    def member(self) -> Member:
        """Gets the member of this Sponsor.


        :return: The member of this Sponsor.
        :rtype: Member
        """
        return self._member

    @member.setter
    def member(self, member: Member):
        """Sets the member of this Sponsor.


        :param member: The member of this Sponsor.
        :type member: Member
        """

        self._member = member

    @property
    def organisation(self) -> Organisation:
        """Gets the organisation of this Sponsor.


        :return: The organisation of this Sponsor.
        :rtype: Organisation
        """
        return self._organisation

    @organisation.setter
    def organisation(self, organisation: Organisation):
        """Sets the organisation of this Sponsor.


        :param organisation: The organisation of this Sponsor.
        :type organisation: Organisation
        """

        self._organisation = organisation

    @property
    def sort_order(self) -> int:
        """Gets the sort_order of this Sponsor.


        :return: The sort_order of this Sponsor.
        :rtype: int
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order: int):
        """Sets the sort_order of this Sponsor.


        :param sort_order: The sort_order of this Sponsor.
        :type sort_order: int
        """

        self._sort_order = sort_order
