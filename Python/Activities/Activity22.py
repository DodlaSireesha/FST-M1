import pytest

def test_add():
    a=50
    b=30

    sum =a+b

    assert sum == 80


def test_subtract():
    a=50
    b=30
    sub =a-b

    assert sub == 20

@pytest.mark.activity
def test_multiply():
    a=5
    b=3
    mul=a*b
    assert mul == 10

@pytest.mark.activity
def test_divide():
    a=20
    b=2
    div= a/b

    assert div == 10


