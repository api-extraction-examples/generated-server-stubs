from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Card(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, author_name=None, author_url=None, blurhash=None, description=None, height=None, html=None, image=None, provider_name=None, provider_url=None, title=None, type=None, url=None, width=None):  # noqa: E501
        """Card - a model defined in OpenAPI

        :param author_name: The author_name of this Card.  # noqa: E501
        :type author_name: str
        :param author_url: The author_url of this Card.  # noqa: E501
        :type author_url: str
        :param blurhash: The blurhash of this Card.  # noqa: E501
        :type blurhash: str
        :param description: The description of this Card.  # noqa: E501
        :type description: str
        :param height: The height of this Card.  # noqa: E501
        :type height: int
        :param html: The html of this Card.  # noqa: E501
        :type html: str
        :param image: The image of this Card.  # noqa: E501
        :type image: str
        :param provider_name: The provider_name of this Card.  # noqa: E501
        :type provider_name: str
        :param provider_url: The provider_url of this Card.  # noqa: E501
        :type provider_url: str
        :param title: The title of this Card.  # noqa: E501
        :type title: str
        :param type: The type of this Card.  # noqa: E501
        :type type: str
        :param url: The url of this Card.  # noqa: E501
        :type url: str
        :param width: The width of this Card.  # noqa: E501
        :type width: int
        """
        self.openapi_types = {
            'author_name': str,
            'author_url': str,
            'blurhash': str,
            'description': str,
            'height': int,
            'html': str,
            'image': str,
            'provider_name': str,
            'provider_url': str,
            'title': str,
            'type': str,
            'url': str,
            'width': int
        }

        self.attribute_map = {
            'author_name': 'author_name',
            'author_url': 'author_url',
            'blurhash': 'blurhash',
            'description': 'description',
            'height': 'height',
            'html': 'html',
            'image': 'image',
            'provider_name': 'provider_name',
            'provider_url': 'provider_url',
            'title': 'title',
            'type': 'type',
            'url': 'url',
            'width': 'width'
        }

        self._author_name = author_name
        self._author_url = author_url
        self._blurhash = blurhash
        self._description = description
        self._height = height
        self._html = html
        self._image = image
        self._provider_name = provider_name
        self._provider_url = provider_url
        self._title = title
        self._type = type
        self._url = url
        self._width = width

    @classmethod
    def from_dict(cls, dikt) -> 'Card':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Card of this Card.  # noqa: E501
        :rtype: Card
        """
        return util.deserialize_model(dikt, cls)

    @property
    def author_name(self) -> str:
        """Gets the author_name of this Card.

        The author of the original resource.  # noqa: E501

        :return: The author_name of this Card.
        :rtype: str
        """
        return self._author_name

    @author_name.setter
    def author_name(self, author_name: str):
        """Sets the author_name of this Card.

        The author of the original resource.  # noqa: E501

        :param author_name: The author_name of this Card.
        :type author_name: str
        """

        self._author_name = author_name

    @property
    def author_url(self) -> str:
        """Gets the author_url of this Card.

        A link to the author of the original resource.  # noqa: E501

        :return: The author_url of this Card.
        :rtype: str
        """
        return self._author_url

    @author_url.setter
    def author_url(self, author_url: str):
        """Sets the author_url of this Card.

        A link to the author of the original resource.  # noqa: E501

        :param author_url: The author_url of this Card.
        :type author_url: str
        """

        self._author_url = author_url

    @property
    def blurhash(self) -> str:
        """Gets the blurhash of this Card.

        A hash computed by the [BlurHash algorithm](https://github.com/woltapp/blurhash), for generating colorful preview thumbnails when media has not been downloaded yet.  # noqa: E501

        :return: The blurhash of this Card.
        :rtype: str
        """
        return self._blurhash

    @blurhash.setter
    def blurhash(self, blurhash: str):
        """Sets the blurhash of this Card.

        A hash computed by the [BlurHash algorithm](https://github.com/woltapp/blurhash), for generating colorful preview thumbnails when media has not been downloaded yet.  # noqa: E501

        :param blurhash: The blurhash of this Card.
        :type blurhash: str
        """

        self._blurhash = blurhash

    @property
    def description(self) -> str:
        """Gets the description of this Card.

        Description of preview.  # noqa: E501

        :return: The description of this Card.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this Card.

        Description of preview.  # noqa: E501

        :param description: The description of this Card.
        :type description: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def height(self) -> int:
        """Gets the height of this Card.

        Height of preview, in pixels.  # noqa: E501

        :return: The height of this Card.
        :rtype: int
        """
        return self._height

    @height.setter
    def height(self, height: int):
        """Sets the height of this Card.

        Height of preview, in pixels.  # noqa: E501

        :param height: The height of this Card.
        :type height: int
        """

        self._height = height

    @property
    def html(self) -> str:
        """Gets the html of this Card.

        HTML to be used for generating the preview card.  # noqa: E501

        :return: The html of this Card.
        :rtype: str
        """
        return self._html

    @html.setter
    def html(self, html: str):
        """Sets the html of this Card.

        HTML to be used for generating the preview card.  # noqa: E501

        :param html: The html of this Card.
        :type html: str
        """

        self._html = html

    @property
    def image(self) -> str:
        """Gets the image of this Card.

        Preview thumbnail (URL).  # noqa: E501

        :return: The image of this Card.
        :rtype: str
        """
        return self._image

    @image.setter
    def image(self, image: str):
        """Sets the image of this Card.

        Preview thumbnail (URL).  # noqa: E501

        :param image: The image of this Card.
        :type image: str
        """

        self._image = image

    @property
    def provider_name(self) -> str:
        """Gets the provider_name of this Card.

        The provider of the original resource.  # noqa: E501

        :return: The provider_name of this Card.
        :rtype: str
        """
        return self._provider_name

    @provider_name.setter
    def provider_name(self, provider_name: str):
        """Sets the provider_name of this Card.

        The provider of the original resource.  # noqa: E501

        :param provider_name: The provider_name of this Card.
        :type provider_name: str
        """

        self._provider_name = provider_name

    @property
    def provider_url(self) -> str:
        """Gets the provider_url of this Card.

        A link to the provider of the original resource.  # noqa: E501

        :return: The provider_url of this Card.
        :rtype: str
        """
        return self._provider_url

    @provider_url.setter
    def provider_url(self, provider_url: str):
        """Sets the provider_url of this Card.

        A link to the provider of the original resource.  # noqa: E501

        :param provider_url: The provider_url of this Card.
        :type provider_url: str
        """

        self._provider_url = provider_url

    @property
    def title(self) -> str:
        """Gets the title of this Card.

        Title of linked resource.  # noqa: E501

        :return: The title of this Card.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this Card.

        Title of linked resource.  # noqa: E501

        :param title: The title of this Card.
        :type title: str
        """
        if title is None:
            raise ValueError("Invalid value for `title`, must not be `None`")  # noqa: E501

        self._title = title

    @property
    def type(self) -> str:
        """Gets the type of this Card.

        The type of the preview card. String (Enumerable, oneOf).  # noqa: E501

        :return: The type of this Card.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this Card.

        The type of the preview card. String (Enumerable, oneOf).  # noqa: E501

        :param type: The type of this Card.
        :type type: str
        """
        allowed_values = ["link", "photo", "video", "rich"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def url(self) -> str:
        """Gets the url of this Card.

        Location of linked resource.  # noqa: E501

        :return: The url of this Card.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this Card.

        Location of linked resource.  # noqa: E501

        :param url: The url of this Card.
        :type url: str
        """
        if url is None:
            raise ValueError("Invalid value for `url`, must not be `None`")  # noqa: E501

        self._url = url

    @property
    def width(self) -> int:
        """Gets the width of this Card.

        Width of preview, in pixels.  # noqa: E501

        :return: The width of this Card.
        :rtype: int
        """
        return self._width

    @width.setter
    def width(self, width: int):
        """Sets the width of this Card.

        Width of preview, in pixels.  # noqa: E501

        :param width: The width of this Card.
        :type width: int
        """

        self._width = width