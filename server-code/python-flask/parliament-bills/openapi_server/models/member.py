from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.house import House
from openapi_server import util

from openapi_server.models.house import House  # noqa: E501

class Member(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, house=None, member_from=None, member_id=None, member_page=None, member_photo=None, name=None, party=None, party_colour=None):  # noqa: E501
        """Member - a model defined in OpenAPI

        :param house: The house of this Member.  # noqa: E501
        :type house: House
        :param member_from: The member_from of this Member.  # noqa: E501
        :type member_from: str
        :param member_id: The member_id of this Member.  # noqa: E501
        :type member_id: int
        :param member_page: The member_page of this Member.  # noqa: E501
        :type member_page: str
        :param member_photo: The member_photo of this Member.  # noqa: E501
        :type member_photo: str
        :param name: The name of this Member.  # noqa: E501
        :type name: str
        :param party: The party of this Member.  # noqa: E501
        :type party: str
        :param party_colour: The party_colour of this Member.  # noqa: E501
        :type party_colour: str
        """
        self.openapi_types = {
            'house': House,
            'member_from': str,
            'member_id': int,
            'member_page': str,
            'member_photo': str,
            'name': str,
            'party': str,
            'party_colour': str
        }

        self.attribute_map = {
            'house': 'house',
            'member_from': 'memberFrom',
            'member_id': 'memberId',
            'member_page': 'memberPage',
            'member_photo': 'memberPhoto',
            'name': 'name',
            'party': 'party',
            'party_colour': 'partyColour'
        }

        self._house = house
        self._member_from = member_from
        self._member_id = member_id
        self._member_page = member_page
        self._member_photo = member_photo
        self._name = name
        self._party = party
        self._party_colour = party_colour

    @classmethod
    def from_dict(cls, dikt) -> 'Member':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Member of this Member.  # noqa: E501
        :rtype: Member
        """
        return util.deserialize_model(dikt, cls)

    @property
    def house(self) -> House:
        """Gets the house of this Member.


        :return: The house of this Member.
        :rtype: House
        """
        return self._house

    @house.setter
    def house(self, house: House):
        """Sets the house of this Member.


        :param house: The house of this Member.
        :type house: House
        """

        self._house = house

    @property
    def member_from(self) -> str:
        """Gets the member_from of this Member.


        :return: The member_from of this Member.
        :rtype: str
        """
        return self._member_from

    @member_from.setter
    def member_from(self, member_from: str):
        """Sets the member_from of this Member.


        :param member_from: The member_from of this Member.
        :type member_from: str
        """

        self._member_from = member_from

    @property
    def member_id(self) -> int:
        """Gets the member_id of this Member.


        :return: The member_id of this Member.
        :rtype: int
        """
        return self._member_id

    @member_id.setter
    def member_id(self, member_id: int):
        """Sets the member_id of this Member.


        :param member_id: The member_id of this Member.
        :type member_id: int
        """

        self._member_id = member_id

    @property
    def member_page(self) -> str:
        """Gets the member_page of this Member.


        :return: The member_page of this Member.
        :rtype: str
        """
        return self._member_page

    @member_page.setter
    def member_page(self, member_page: str):
        """Sets the member_page of this Member.


        :param member_page: The member_page of this Member.
        :type member_page: str
        """

        self._member_page = member_page

    @property
    def member_photo(self) -> str:
        """Gets the member_photo of this Member.


        :return: The member_photo of this Member.
        :rtype: str
        """
        return self._member_photo

    @member_photo.setter
    def member_photo(self, member_photo: str):
        """Sets the member_photo of this Member.


        :param member_photo: The member_photo of this Member.
        :type member_photo: str
        """

        self._member_photo = member_photo

    @property
    def name(self) -> str:
        """Gets the name of this Member.


        :return: The name of this Member.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Member.


        :param name: The name of this Member.
        :type name: str
        """

        self._name = name

    @property
    def party(self) -> str:
        """Gets the party of this Member.


        :return: The party of this Member.
        :rtype: str
        """
        return self._party

    @party.setter
    def party(self, party: str):
        """Sets the party of this Member.


        :param party: The party of this Member.
        :type party: str
        """

        self._party = party

    @property
    def party_colour(self) -> str:
        """Gets the party_colour of this Member.


        :return: The party_colour of this Member.
        :rtype: str
        """
        return self._party_colour

    @party_colour.setter
    def party_colour(self, party_colour: str):
        """Sets the party_colour of this Member.


        :param party_colour: The party_colour of this Member.
        :type party_colour: str
        """

        self._party_colour = party_colour
